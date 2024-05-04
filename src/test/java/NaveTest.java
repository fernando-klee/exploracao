import domain.Nave;
import domain.Planeta;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NaveTest {

    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta() {
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posisaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posisaoResultante);
    }

    @Test
    public void deveConseguirChegarAteUmPlanetaEVoltar() {
        int posicaoEsperada = 0;
        Nave starkiller = new Nave(1000);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        starkiller.explorar(tatooine);
        int valorResultante = starkiller.getPosicao();

        Assert.assertEquals(posicaoEsperada, valorResultante);
    }

    @Test
    public void deveConseguirChegarAteUmPlanetaENaoVoltar() {
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(15);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posisaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posisaoResultante);
    }

    @Test
    public void deveRetornarQueTemCombustivelSuficienteParaIrEVoltar() {
        int combustivelEsperado = 940;
        Nave starkiller = new Nave(1000);
        Planeta saturno = new Planeta(10, new ArrayList<>());
        starkiller.explorar(saturno);

        int combustivelRestante = starkiller.getQuantidadeDeCombustivel();
        Assert.assertEquals(combustivelEsperado, combustivelRestante);
    }

    @Test
    public void deveRetornarQueTemNaoCombustivelSuficienteParaIrEVoltar() {
        int combustivelEsperado = 8;
        Nave falconxx = new Nave(8);
        Planeta saturno = new Planeta(10, new ArrayList<>());
        falconxx.explorar(saturno);

        int combustivelRestante = falconxx.getQuantidadeDeCombustivel();
        Assert.assertEquals(combustivelEsperado, combustivelRestante);
    }
}
