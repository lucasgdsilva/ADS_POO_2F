package ads.poo;

public class Batedeira {

    private double velocidadeAtual;
    private boolean ligada;
    private int potencia;
    private int capacidade;

    public void ligadaDesligada(){
        ligada = !ligada;
    }

    public String isLigada() {
        if (ligada || potencia >= 1) {
            return "A batedeira está ligada.";
        } else {
            return "A batedeira está desligada.";
        }
    }

        public void definirPotencia(int p) {

            potencia = p;
            switch (p) {
                case 0:
                    velocidadeAtual = 0.0;
                    break;
                case 1:
                    velocidadeAtual = 3.5;
                    break;
                case 2:
                    velocidadeAtual = 6.5;
                    break;
                case 3:
                    velocidadeAtual = 10.0;
                    break;
            }
            }

        public double obterPotencia() {
            return potencia;
        }

        public double obterVelocidade() {
            return velocidadeAtual;
        }

        public void definirCapacidade(int c) {
            if (c > 0 && c <= 10) {
                capacidade = c;
            } else if (c < 0) {
                capacidade = 0;
            } else if (c > 10) {
                capacidade = 10;
            }
        }

        public int obterCapacidade() {
            return capacidade;
        }
}
