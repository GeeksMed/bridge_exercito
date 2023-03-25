package padroescomportamentais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaboTest{
    @Test
    void deveRetornarSalarioCaboCategoriaA() {
        Habilitacao habilitacao = new CategoriaA();
        Cabo cabo = new Cabo(2627.0f);
        cabo.setHabilitacao(habilitacao);
        assertEquals(2627.0f, cabo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioCaboCategoriaB() {
        Habilitacao habilitacao = new CategoriaB();
        Cabo cabo = new Cabo(2627.0f);
        cabo.setHabilitacao(habilitacao);
        assertEquals(2627.0f, cabo.calcularSalario(), 0.01f);
    }
}
