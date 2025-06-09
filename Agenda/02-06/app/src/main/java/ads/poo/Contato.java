package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ColecaoEmail emails = new ColecaoEmail();
    private ColecaoTelefone telefones = new ColecaoTelefone();

    public Contato(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean addEmail(String email, String rotulo) {
        return emails.add(email,rotulo);
    }

    public boolean addTelefone(String telefone, String rotulo) {
        return telefones.add(telefone, rotulo);
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.remove(rotulo);
    }
    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String telefone, String rotulo) {
       return telefones.update(telefone,rotulo);
    }
    public boolean updateEmail(String email, String rotulo) {
        return emails.update(email,rotulo);
    }

    @Override
    public String toString() {
        return "Contato : " + nome + " " + sobrenome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Email: " + emails + "\n" +
                "Telefone: " + telefones;

    }

}

