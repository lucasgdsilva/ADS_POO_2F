package ads.poo;

public class Arara extends Animal implements Ave, Voador{
    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.botarOvo();
    }

    @Override
    public String botarOvo() {
        return super.nome + " está borando ovo";
    }


    @Override
    public String Voar() {
        return "";
    }
}
