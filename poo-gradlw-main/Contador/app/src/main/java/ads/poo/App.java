package ads.poo;

public class App {

    public static void main(String[] args) {
        Contador cont = new Contador();

        cont.definirValor(10);
        cont.IncrementarValor();
        cont.IncrementarValor();

        System.out.println(cont.obterValor());
    }
}