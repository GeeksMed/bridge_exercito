package padroescomportamentais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtenenteTest {
    @Test
    void deveRetornarSalarioSubtenenteCategoriaA() {
        Habilitacao habilitacao = new CategoriaA();
        Subtenente subtenente = new Subtenente(6169.0f);
        subtenente.setHabilitacao(habilitacao);
        assertEquals(6852.02f, subtenente.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioSubtenenteCategoriaB() {
        Habilitacao habilitacao = new CategoriaB();
        Subtenente subtenente = new Subtenente(6169.0f);
        subtenente.setHabilitacao(habilitacao);
        assertEquals(6510.51f, subtenente.calcularSalario(), 0.01f);
    }
}
