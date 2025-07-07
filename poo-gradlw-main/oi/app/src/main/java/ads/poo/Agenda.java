package ads.poo;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public int getIndiceContato(Contato contato) {
        return this.contatos.indexOf(contato);
    }


    public boolean addContato(Contato contato){
        return contatos.add(contato);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> nova = new ArrayList<>();

        contatos.stream()
                .filter(c -> c.getNome().contains(nome) && c.getSobrenome().contains(sobrenome))
                .forEach(nova::add);
        return nova;
    }

    public boolean removeContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            return true;
        }
        return false;
    }


    //Adding
    public boolean addTelefone (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.addTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean addEmail (String rotulo, String valor, int indiceContatoNaLista){
        if(indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.addEmail(rotulo, valor);
        }
        return false;
    }

    //Updating
    public boolean updateTelefone (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.updateTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean updateEmail (String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.updateEmail(rotulo, valor);
        }
        return false;
    }

    //Removing
    public boolean removeTelefone (String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.removeTelefone(rotulo);
        }
        return false;
    }

    public boolean removeEmail (String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()){
            Contato c = contatos.get(indiceContatoNaLista);
            return c.removeEmail(rotulo);
        }
        return false;
    }

    // toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contatos.size(); i++) {
            sb.append("Índice: ").append(i).append("\n");
            sb.append(contatos.get(i).toString()).append("\n");
            sb.append("------------------------------\n");
        }
        return sb.toString();
    }
}
