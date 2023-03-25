package padroescomportamentais.bridge;

public class Subtenente extends Posto{
    public Subtenente(float salarioBase) { super(salarioBase); }
    public float calcularSalario() { return (float) (this.salarioBase + (1.3 * this.habilitacao.adicionalSalarial())); }
}
