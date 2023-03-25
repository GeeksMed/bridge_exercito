package padroescomportamentais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeiroSargentoTest {
    @Test
    void deveRetornarSalarioPrimeiroSargentoCategoriaA() {
        Habilitacao habilitacao = new CategoriaA();
        PrimeiroSargento primeiro_sargento = new PrimeiroSargento(5483.0f);
        primeiro_sargento.setHabilitacao(habilitacao);
        assertEquals(6087.21f, primeiro_sargento.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioPrimeiroSargentoCategoriaB() {
        Habilitacao habilitacao = new CategoriaB();
        PrimeiroSargento primeiro_sargento = new PrimeiroSargento(5483.0f);
        primeiro_sargento.setHabilitacao(habilitacao);
        assertEquals(5785.10f, primeiro_sargento.calcularSalario(), 0.01f);
    }
}
