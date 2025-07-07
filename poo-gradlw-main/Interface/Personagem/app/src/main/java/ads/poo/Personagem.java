package ads.poo;

public class Personagem {

    private String nome;
    private String classe;

    private int infidelidade;
    private int hp;
    private int armadura;
    private int dano;

    public void definirClasse(String c) {
        classe = c;
    }

    public void definirInfidelidade(int i) {
        infidelidade = i;
    }

    public void definirHP(int h) {
        hp = h;
    }

    public void definirArmadura(int a) {
        armadura = a;
    }

    public void definirDano(int d) {
        dano = d;
    }
    public String definirNome(String n) {
        nome = n;
        return nome;
    }

    public String obterFicha() {
        return "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "HP: " + hp * armadura + "\n" +
               "Armadura: " + armadura + "\n" +
               "Dano: " + dano + "\n" +
                "Infidelidade: " + infidelidade * hp;


    }
}
    

