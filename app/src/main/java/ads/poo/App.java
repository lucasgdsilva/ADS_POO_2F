
package ads.poo;

public class App {


    public static void main(String[] args) {
        Caneta bic = new Caneta();

        bic.definirNivelTinta(101);
        bic.abrirFechar();



        System.out.println(bic.desenhar(5));
        System.out.println(bic.desenhar(2));
        System.out.println(bic.desenhar(4));
        System.out.println(bic.obternivelTinta());
    }
}
