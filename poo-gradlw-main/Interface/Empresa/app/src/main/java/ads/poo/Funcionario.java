package ads.poo;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected float salarioBase;

    public Funcionario(float salarioBase, String cargo, String nome) {
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.nome = nome;
    }

    public abstract float calcularSalario();
}
