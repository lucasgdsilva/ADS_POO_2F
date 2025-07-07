package ads.poo;

public class Linha extends Forma {

    Ponto inicio;
    Ponto fim;

    public Linha(Ponto inicio, Ponto fim, String corLinha) {
        super(corLinha);
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Está sendo desenhado uma linha nas seguintes coordenadas: ("
                + inicio.x + ", " + inicio.y + ") até ("
                + fim.x + ", " + fim.y + ") na cor " + corLinha;
    }
}
