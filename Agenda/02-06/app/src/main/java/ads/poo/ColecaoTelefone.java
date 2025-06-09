package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class ColecaoTelefone {
    private HashMap<String,String> dados = new HashMap<>();
    private String telefone;
    private String rotulo;





    public boolean add(String rotulo, String telefone){
        String eR = "^[0-9]+$";

        if(telefone.matches(eR) && dados.get(rotulo) == null) {
            dados.put(rotulo, telefone);
            return true;
        }
        return false;

    }
    public boolean remove(String rotulo){
        dados.remove(rotulo);
        return true;
    }
    public boolean update(String rotulo, String telefone){
        dados.put(rotulo,telefone);
        return true;
    }
    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        dados.forEach((rotulo ,telefone) -> sb.append(rotulo + ": +" + formata("##(##)#####-####", telefone )));
        return sb.toString();
    }


}
