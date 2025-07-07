package ads.poo;

public class ComissionadoEfeito extends Comissionado {

    private double valorVenda;

    public ComissionadoEfeito(float salarioBase, String cargo, String nome, double percentualComissao) {
        super(salarioBase, cargo, nome, percentualComissao);
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + calcularPercentual(500,10);
    }
}
