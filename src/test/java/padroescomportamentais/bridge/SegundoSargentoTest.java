package padroescomportamentais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegundoSargentoTest {
    @Test
    void deveRetornarSalarioSegundoSargentoCategoriaA() {
        Habilitacao habilitacao = new CategoriaA();
        SegundoSargento segundo_sargento = new SegundoSargento(4770.0f);
        segundo_sargento.setHabilitacao(habilitacao);
        assertEquals(5347.94f, segundo_sargento.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioSegundoSargentoCategoriaB() {
        Habilitacao habilitacao = new CategoriaB();
        SegundoSargento segundo_sargento = new SegundoSargento(4770.0f);
        segundo_sargento.setHabilitacao(habilitacao);
        assertEquals(5058.97f, segundo_sargento.calcularSalario(), 0.01f);
    }
}
