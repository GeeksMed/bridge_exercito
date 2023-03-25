package padroescomportamentais.bridge;

public class SegundoSargento extends Posto{
    public SegundoSargento(float salarioBase) { super(salarioBase); }
    public float calcularSalario() { return (float) (this.salarioBase + (1.1 * this.habilitacao.adicionalSalarial())); }
}
