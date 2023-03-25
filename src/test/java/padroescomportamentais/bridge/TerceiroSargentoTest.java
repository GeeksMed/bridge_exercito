package padroescomportamentais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerceiroSargentoTest {
    @Test
    void deveRetornarSalarioTerceiroSargentoCategoriaA() {
        Habilitacao habilitacao = new CategoriaA();
        TerceiroSargento terceiro_sargento = new TerceiroSargento(3825.0f);
        terceiro_sargento.setHabilitacao(habilitacao);
        assertEquals(4350.4f, terceiro_sargento.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioTerceiroSargentoCategoriaB() {
        Habilitacao habilitacao = new CategoriaB();
        TerceiroSargento terceiro_sargento = new TerceiroSargento(3825.0f);
        terceiro_sargento.setHabilitacao(habilitacao);
        assertEquals(4087.7f, terceiro_sargento.calcularSalario(), 0.01f);
    }
}
