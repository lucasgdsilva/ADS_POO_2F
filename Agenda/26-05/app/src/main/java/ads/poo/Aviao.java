package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int peso;
    private int passageiros;
    private int tripulantes;
    private double combustivel;
    private int numMotores;
    private ArrayList<Motor>  motores = new ArrayList<>();

    public Aviao(int peso, int passageiros, int tripulantes, double combustivel, int numMotores, String tipoMotor) {
        this.peso = peso;
        this.passageiros = passageiros;
        this.tripulantes = tripulantes;
        this.combustivel = combustivel;
        this.numMotores= setNumMotores(numMotores);
        for (int i = 0; i < this.numMotores; i++) {
           motores.add(new Motor(tipoMotor));
        }
    }



    public int getNumMotores() {
        return numMotores;
    }

    public int setNumMotores(int numMotores) {
        this.numMotores = numMotores;
        if (numMotores < 1) {
            numMotores = 1;
            return numMotores;
        }else if (numMotores > 8) {
            numMotores = 8;
            return numMotores;
        }
        return numMotores;
    }

    public void ligarDesligar() {
        this.motores.forEach(Motor::ligarDesligar);
    }

    @Override
    public String toString() {
        return "Avião: "+ "\n"+
                "Peso: "+ peso + " Toneladas" + "\n"+
                "Passageiros: "+ passageiros + " passageiros" + "\n" +
                "Tripulnates: " + tripulantes + " tripulantes" + "\n" +
                "Combustivel: " + combustivel + " Litros" + "\n" +
                "Motores: " + motores.toString();
    }
}
