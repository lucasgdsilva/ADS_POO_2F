package ads.poo;

public class Cavaleiro extends Personagem{


    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return "Cavaleiro " + super.mover();
    }

    @Override
    public String atacar() {
        return "Cavaleiro " + super.atacar();
    }
}
