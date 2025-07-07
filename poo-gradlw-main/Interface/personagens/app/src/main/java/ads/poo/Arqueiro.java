package ads.poo;

public class Arqueiro extends Personagem{
    private double velocidade;

    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return "Arqueiro " + super.mover();
    }

    @Override
    public String atacar() {
        return "Arqueiro " + super.atacar();
    }
}
