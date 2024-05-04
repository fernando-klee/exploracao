package domain;

import util.RecursosEnum;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private int quantidadeDeCombustivel;
    private int posicao;
    private List<RecursosEnum> recursos = new ArrayList<>();

    public Nave(int quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.posicao = 0;
    }
    public void explorar(Planeta planeta) {
        int combustivelGastoAtePlaneta = planeta.getPosicao() * 3;
        if (quantidadeDeCombustivel > combustivelGastoAtePlaneta) {
            quantidadeDeCombustivel -= combustivelGastoAtePlaneta;
            posicao = planeta.getPosicao();
            recursos.addAll(planeta.getRecursos());
            if (quantidadeDeCombustivel > combustivelGastoAtePlaneta) {
                quantidadeDeCombustivel -= combustivelGastoAtePlaneta;
                posicao = 0;
            } else {
                int quantidadeCombustivelPosicao = quantidadeDeCombustivel / 3;
                posicao -= quantidadeCombustivelPosicao;
            }
        } else {
            int quantidadeCombustivelPosicao = quantidadeDeCombustivel / 3;
            posicao += quantidadeCombustivelPosicao;
        }
    }

    public int getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public int getPosicao() {
        return posicao;
    }
}
