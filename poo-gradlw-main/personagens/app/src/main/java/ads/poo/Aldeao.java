package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletador{
    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }

    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);

    }

    @Override
    public String atacar() {
        return "Aldeão atacando.";
    }

    @Override
    public String mover() {
        return "Aldeão se movendo na velocidade de:";
    }



//    public String colher(){
//        return "O aldeão está colhendo";
//    }
//
//    @Override
//    public String mover() {
//        return "Aldeão " + super.mover();
//    }
//
//    @Override
//    public String atacar() {
//        return "Aldeão " + super.atacar();
//    }
}
