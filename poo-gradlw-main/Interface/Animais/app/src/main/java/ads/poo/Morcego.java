package ads.poo;

public class Morcego extends Animal implements Mamifero{
    public Morcego(String nome) {
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
}
