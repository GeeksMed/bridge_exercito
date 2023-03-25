package padroescomportamentais.bridge;

public class PrimeiroSargento extends Posto{
    public PrimeiroSargento(float salarioBase) { super(salarioBase); }
    public float calcularSalario() { return (float) (this.salarioBase + (1.15 * this.habilitacao.adicionalSalarial())); }
}
