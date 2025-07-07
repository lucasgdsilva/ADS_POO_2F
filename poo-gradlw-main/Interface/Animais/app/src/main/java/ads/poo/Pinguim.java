package ads.poo;

public class Pinguim extends Animal implements Ave{
    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return "";
    }

    @Override
    public String botarOvo() {
        return "";
    }
}
