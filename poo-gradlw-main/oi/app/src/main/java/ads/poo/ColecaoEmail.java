package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {
    private HashMap<String, String> colecaoEmail;

    public ColecaoEmail() {
        colecaoEmail = new HashMap<>();
    }

    public boolean add(String rotulo, String email){
        colecaoEmail.put(rotulo, email);
        return colecaoEmail.containsKey(rotulo);
    }

    public boolean remove(String rotulo){
        colecaoEmail.entrySet().removeIf(email -> email.getKey().equals(rotulo));
        return !colecaoEmail.containsKey(rotulo);
    }

    public boolean update(String rotulo, String valor){
        if (!colecaoEmail.containsKey(rotulo)){
            return false;
        }
        colecaoEmail.replace(rotulo, valor);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        colecaoEmail.forEach((chave, valor) -> sb.append("    - " + chave + ": " + valor + "\n"));
        return sb.toString();
    }
}
