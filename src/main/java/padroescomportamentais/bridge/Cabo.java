package padroescomportamentais.bridge;

public class Cabo extends Posto{
    public Cabo(float salarioBase) { super(salarioBase); }
    public float calcularSalario() {
        return this.salarioBase;
    }
}
