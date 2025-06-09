package ads.poo;

public class Motor {
    private int consumoCombustivel;
    private String tipoMotor;
    private boolean ligado;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
        this.ligado = false;

    }

    public int getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(int consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public boolean ligarDesligar() {
        if (ligado == false) {
            ligado = true;
            return true;
        }
        ligado = false;
        return false;
    }

    @Override
    public String toString() {
        return "Motor: " + tipoMotor + " Ligado: " + ligado + "\n";
    }
}
