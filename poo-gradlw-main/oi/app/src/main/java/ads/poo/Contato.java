package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    //Constructor
    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        telefones = new ColecaoTelefone();
        emails = new ColecaoEmail();
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    //Methods
    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return telefones.update(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor){
        return emails.update(rotulo, valor);
    }

    //toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("------------------------------\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Sobrenome: ").append(sobrenome).append("\n");
        sb.append("Data de Nascimento: ").append(dataNasc).append("\n");
        sb.append("Telefones: ").append("\n").append(telefones);
        sb.append("Emails:").append("\n").append(emails);
        return sb.toString();
    }
}

