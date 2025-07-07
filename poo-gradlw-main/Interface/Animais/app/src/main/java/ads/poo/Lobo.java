package ads.poo;

public class Lobo extends Animal implements Mamifero, Terrestre{
    public Lobo(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return "";
    }

    @Override
    public String mamar() {
        return "";
    }

    @Override
    public String produzirLeite() {
        return "";
    }

    @Override
    public String correr() {
        return "";
    }
}
