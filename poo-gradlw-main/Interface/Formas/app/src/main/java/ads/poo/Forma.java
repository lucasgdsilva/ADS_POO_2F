package ads.poo;

public abstract class Forma {
    protected String corLinha;

    public Forma(String corLinha) {
        this.corLinha = corLinha;
    }

    public abstract String desenhar();
}
