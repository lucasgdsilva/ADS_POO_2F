package ads.poo;

import java.util.HashMap;

public class ColecaoTelefone {
    private HashMap<String, String> colecaoTelefone;

    public ColecaoTelefone() {
        colecaoTelefone = new HashMap<>();
    }

    public boolean add(String rotulo, String contato){
        colecaoTelefone.put(rotulo, contato);
        return colecaoTelefone.containsKey(rotulo);
    }

    public boolean remove(String rotulo){
        colecaoTelefone.entrySet().removeIf(contato -> contato.getKey().equals(rotulo));
        return !colecaoTelefone.containsKey(rotulo);
    }

    public boolean update(String rotulo, String valor){
        if (!colecaoTelefone.containsKey(rotulo)){
            return false;
        }
        colecaoTelefone.replace(rotulo, valor);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        colecaoTelefone.forEach((chave, valor) -> sb.append("    - " + chave + ": " + valor + "\n"));
        return sb.toString();
    }
}
