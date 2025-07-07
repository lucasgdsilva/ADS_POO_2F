package ads.poo;

public abstract class Personagem {
        private int vida;
        private int ataque;
        private double velocidade;


    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String atacar();
    public abstract String mover();


//    public String atacar(){
//        return "está atacando.";
//    }
//    public String mover() {
////        return "está se movendo em " + this.velocidade + " de velocidade.";
////
}
