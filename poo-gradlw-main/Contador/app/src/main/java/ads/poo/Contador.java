package ads.poo;

public class Contador {

    private int ValorAtual;
    
    public void definirValor (int v){
        ValorAtual = v;
    }
    
    public void IncrementarValor (){
    ValorAtual++;
    }

    public int obterValor(){
        return ValorAtual;
    }
}
