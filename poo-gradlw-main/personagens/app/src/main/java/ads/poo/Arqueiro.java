package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro{
    @Override
    public String atacar() {
        return "";
    }

    @Override
    public String mover() {
        return "";
    }

    private double velocidade;

    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

}
