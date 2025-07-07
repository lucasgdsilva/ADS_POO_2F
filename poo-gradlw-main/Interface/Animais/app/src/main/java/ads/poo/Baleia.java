package ads.poo;

public class Baleia extends Animal implements Mamifero{
    public Baleia(String nome) {
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
