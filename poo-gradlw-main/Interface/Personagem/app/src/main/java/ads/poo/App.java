package ads.poo;

import ads.poo.Personagem;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Personagem chico = new Personagem();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma classe: ");
        System.out.println("1 - Tank");
        System.out.println("2 - Mago");
        System.out.println("3 - Atirador");
        String c = scanner.nextLine();

        switch (c) {
            case "1":
                chico = new Personagem();
                
                chico.definirClasse("Tank");
                chico.definirArmadura(70);
                chico.definirHP(100);
                chico.definirNome("Chico Picadinho");
                chico.definirDano(48);
                chico.definirInfidelidade(0);
                break;
            case "2":
            chico = new Personagem();
            
            chico.definirClasse("Mago");
            chico.definirArmadura(5);
            chico.definirHP(100);
            chico.definirNome("Chico Linguisa");
            chico.definirDano(107);
            chico.definirInfidelidade(22);
                break;
            case "3":
            chico = new Personagem();

            chico.definirClasse("Atirador");
            chico.definirArmadura(20);
            chico.definirHP(100);
            chico.definirNome("Chico Moedas");
            chico.definirDano(124);
            chico.definirInfidelidade(100);
                break;
        }
        
        if (c.equals("1") || c.equals("2") || c.equals("3")) {
        System.out.println(chico.obterFicha());
        scanner.close();
        } else {
            System.out.println("Classe inválida.");
        }

    }
}

