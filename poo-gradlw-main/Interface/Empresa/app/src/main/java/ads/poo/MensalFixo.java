package ads.poo;

public class MensalFixo extends Funcionario implements Salario {

    public MensalFixo(float salarioBase, String cargo, String nome) {
        super(salarioBase, cargo, nome);
    }

    @Override
    public float calcularSalario() {
        return salarioBase;
    }
}
