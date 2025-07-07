package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{
    @Override
    public String atacar() {
        return "";
    }

    @Override
    public String mover() {
        return "";
    }

    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

}
