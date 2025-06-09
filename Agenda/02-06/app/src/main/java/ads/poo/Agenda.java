package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }
    public boolean addContatos(Contato c){
        contatos.add(c);
        return true;
    }


    public ArrayList<Contato> findContato(String nome, String sobrenome) {
            ArrayList<Contato> encontrados = new ArrayList<>();

            for (Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome) && c.getSobrenome().equalsIgnoreCase(sobrenome)) {
                    encontrados.add(c);
                }
            }

            return encontrados;
    }
    public boolean removeContato (int indiceContatoNaLista) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            contatos.remove(indiceContatoNaLista);
            return true;
        }
        return false;
    }
    public boolean addEmail(String rotulo, String email, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
           Contato novo = contatos.get(indiceContatoNaLista);
           novo.addEmail(email,rotulo);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String telefone, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            Contato novo = contatos.get(indiceContatoNaLista);
            novo.addTelefone(telefone,rotulo);
            return true;
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            Contato novo = contatos.get(indiceContatoNaLista);
            novo.updateEmail(email,rotulo);
            return true;
        }
        return false;
    }
    public boolean updateTelefone(String rotulo, String telefone, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            boolean c = contatos.get(indiceContatoNaLista).updateTelefone(telefone,rotulo);
            return c;
        }
        return false;
    }

    public boolean removeEmail(String rotulo,int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            boolean b = contatos.get(indiceContatoNaLista).removeEmail(rotulo);
            return b;
        }
        return false;
    }

    public boolean removeTelefone(String rotulo,int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            boolean b = contatos.get(indiceContatoNaLista).removeTelefone(rotulo);
            return b;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contatos.size(); i++) {
            sb.append("Índice: ").append(i).append("\n");
            sb.append(contatos.get(i).toString()).append("\n");
            sb.append("--------------------------------------------------\n");
        }
        return sb.toString();
    }
}
