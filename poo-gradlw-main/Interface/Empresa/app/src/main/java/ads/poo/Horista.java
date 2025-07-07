package ads.poo;

public class Horista extends Funcionario implements Salario,HoraExtra {
    public Horista(float salarioBase, String cargo, String nome) {
        super(salarioBase, cargo, nome);
    }

    @Override
    public float calcularHoraExtra(int horasExtras, float valorHoraExtra) {
        return horasExtras * valorHoraExtra;
    }

    @Override
    public float calcularSalario() {
        return salarioBase + calcularHoraExtra(10, 15);
    }

}]
