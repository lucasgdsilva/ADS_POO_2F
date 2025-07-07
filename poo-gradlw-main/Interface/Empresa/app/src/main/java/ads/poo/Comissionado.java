package ads.poo;


public class Comissionado extends Funcionario implements PercentualVendas  {
    protected double percentualComissao;

    public Comissionado(float salarioBase, String cargo, String nome, double percentualComissao) {
        super(salarioBase, cargo, nome);
        this.percentualComissao = percentualComissao;
    }


    @Override
    public float calcularSalario() {
        return calcularPercentual(500, 10);
    }

    @Override
    public float calcularPercentual(float valorVendas, float percentualComissao) {
        return valorVendas * percentualComissao / 100;
    }
}
