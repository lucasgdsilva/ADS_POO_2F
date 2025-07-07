package ads.poo;

public class Gato extends Animal implements Mamifero, Terrestre{
    public Gato(String nome) {
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
