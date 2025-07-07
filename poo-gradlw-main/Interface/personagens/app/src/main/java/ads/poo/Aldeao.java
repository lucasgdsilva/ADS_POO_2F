package ads.poo;

public class Aldeao extends Personagem{


    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);

    }

    public String colher(){
        return "O aldeão está colhendo";
    }

    @Override
    public String mover() {
        return "Aldeão " + super.mover();
    }

    @Override
    public String atacar() {
        return "Aldeão " + super.atacar();
    }
}
