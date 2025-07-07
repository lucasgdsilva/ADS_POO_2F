package ads.poo;

public class Avestruz extends Animal implements Ave, Terrestre{
    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return this.botarOvo();
    }

    @Override
    public String botarOvo() {
        return super.nome + " está botando ovo";
    }


    @Override
    public String correr() {
        return super.nome + " está correndo";
    }
}
