package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {

    private HashMap<String,String> dados = new HashMap<>();


    public boolean add(String email, String rotulo){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a−z]{2,})$";
        if(email.matches(eR) == true  ) {
            dados.put(rotulo, email);
            return true;
        }else {
            return false;
        }

    }



    public boolean remove(String rotulo){
        dados.remove(rotulo);
        return true;
    }

    public boolean update(String email, String rotulo) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(eR) == true && dados.get(email) == null) {
            dados.put(rotulo, email);
            return true;
        } else {
            return false;
        }
    }


        @Override
    public String toString() {
        return "Rotulos/Email: " + dados;

    }
}








