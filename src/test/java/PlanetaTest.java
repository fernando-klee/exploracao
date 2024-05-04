import domain.Planeta;
import org.junit.Assert;
import org.junit.Test;
import util.RecursosEnum;

import java.util.ArrayList;
import java.util.Arrays;

public class PlanetaTest {

    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso() {
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        int valorEsperado = 0;

        int valorResultante = tatooine.getValorTotal();

        Assert.assertEquals(valorEsperado, valorResultante);
    }

    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta() {
        Planeta marte = new Planeta(6, Arrays.asList(RecursosEnum.AGUA, RecursosEnum.FERRO));
        int valorEsperado = 210;

        int valorResultante = marte.getValorTotal();

        Assert.assertEquals(valorEsperado, valorResultante);
    }

    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso() {
        Planeta vegeta = new Planeta(9, new ArrayList<>());
        int valorEsperado = 0;

        int valorResultante = vegeta.getPesoTotal();

        Assert.assertEquals(valorEsperado, valorResultante);
    }

    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta() {
        Planeta vegeta = new Planeta(9, Arrays.asList(RecursosEnum.OURO, RecursosEnum.SILICIO, RecursosEnum.OXIGENIO));
        int valorEsperado = 157;

        int valorResultante = vegeta.getPesoTotal();

        Assert.assertEquals(valorEsperado, valorResultante);
    }
}
