package ads.poo;

public class App {

    public static void main(String[] args) {
        Batedeira bat = new Batedeira();

        bat.definirPotencia(3);
        bat.definirCapacidade(8);
        
        System.out.println(bat.isLigada());
        System.out.println("Capacidade: " + bat.obterCapacidade() + " litros");
        System.out.println("Potência: " + bat.obterPotencia());
        System.out.println("Velocidade: " + bat.obterVelocidade());

    }
}
