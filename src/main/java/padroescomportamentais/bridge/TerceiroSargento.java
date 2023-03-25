package padroescomportamentais.bridge;

public class TerceiroSargento extends Posto{
    public TerceiroSargento(float salarioBase) { super(salarioBase); }
    public float calcularSalario() { return this.salarioBase + this.habilitacao.adicionalSalarial(); }
}
