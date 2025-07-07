package ads.poo;

public class Editora {
    private int idEditora;
    private String nome;
    private String cidade;

    public Editora(int idEditora, String nome, String cidade) {
        this.idEditora = idEditora;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}