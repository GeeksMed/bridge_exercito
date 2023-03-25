package padroescomportamentais.bridge;

public abstract class Posto{
    protected Habilitacao habilitacao;
    protected float salarioBase;
    public Posto(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setHabilitacao(Habilitacao habilitacao) { this.habilitacao = habilitacao; }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public abstract float calcularSalario();
}