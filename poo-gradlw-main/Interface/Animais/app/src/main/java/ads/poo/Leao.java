package ads.poo;

public class Leao extends Animal implements Mamifero, Terrestre{
    public Leao(String nome) {
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
