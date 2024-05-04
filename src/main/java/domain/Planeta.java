package domain;

import util.RecursosEnum;

import java.util.List;

public class Planeta {
    private int posicao;
    private List<RecursosEnum> recursos;

    public Planeta(int posicao, List<RecursosEnum> recursos) {
        this.posicao = posicao;
        this.recursos = recursos;
    }

    public int getValorTotal() {
        int valorTotal = 0;
        for (RecursosEnum recurso: recursos) {
            valorTotal+= recurso.getValor();
        } return valorTotal;
    }
    public int getPesoTotal() {
        int valorPesoTotal = 0;
        for (RecursosEnum recurso: recursos) {
            valorPesoTotal += (recurso.getValor() / recurso.getPeso());
        } return valorPesoTotal;
    }

    public int getPosicao() {
        return posicao;
    }

    public List<RecursosEnum> getRecursos() {
        return recursos;
    }
}
