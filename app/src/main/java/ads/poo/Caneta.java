package ads.poo;

public class Caneta {

    // atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private String desenhar;


    // metodos
    public void definirCor(String c) {

        cor = c;
    }

    public String obtercor() {

        return cor;
    }

    public String exibircor() {
        return cor;
    }


    public void definirNivelTinta(double n) {

        if (n > 100) {
            nivelTinta = 100;

        } else if (n < 0) {
            nivelTinta = 0;
        } else {
            nivelTinta = n;
        }
    }

    public double obternivelTinta() {

        return nivelTinta;
    }

    public void abrirFechar() {

        aberta = !aberta;
    }

    public boolean isAberta() {

        return aberta;
    }

    public String desenhar(int quantidade) {
        if (aberta == false) {
            System.out.println("Necessita Abrir a Caneta");
        } else {
            int quantos = quantidade * 10;
            nivelTinta -= quantos;

        }
        if (nivelTinta < 0) {
            System.out.println("Necessita de mais Tinta");
        }else {
            return "-".repeat(quantidade);
        }
        return desenhar;


    }

}