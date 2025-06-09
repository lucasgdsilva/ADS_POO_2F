package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {

    private HashMap<String,String> dados = new HashMap<>();


    public boolean add(String email, String rotulo){
        String eR = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(email.matches(eR)) {
            dados.put(rotulo, email);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(String email, String rotulo) {
        String eR = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(eR) && dados.get(email) == null) {
            dados.put(rotulo, email);
            return true;
        } else {
            return false;
        }
    }



    public boolean remove(String rotulo){
        dados.remove(rotulo);
        return true;
    }




    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            dados.forEach((rotulo, email) -> sb.append(rotulo).append(": ").append(email).append("\n"));
            return sb.toString();
    }
}








