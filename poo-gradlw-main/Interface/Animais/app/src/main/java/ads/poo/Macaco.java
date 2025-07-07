package ads.poo;

public class Macaco extends Animal implements Terrestre, Mamifero{
    @Override
    public String habilidade() {
        return this.produzirLeite() + " " + this.correr() + " " + this.mamar();
    }

    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public String mamar() {
        return super.nome + " está mamando.";
    }

    @Override
    public String produzirLeite() {
        return super.nome + " está produzindo leite.";
    }

    @Override
    public String correr() {
        return super.nome + " está correndo.";
    }
}
