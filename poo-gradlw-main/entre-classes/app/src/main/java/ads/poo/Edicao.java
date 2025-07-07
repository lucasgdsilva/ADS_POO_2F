package ads.poo;

public class Edicao {
    private int idEdicao;
    private int ano;
    private int paginas;
    private String isbn;
    private Editora editora; // Associação: 1 Editora para muitas Edições

    public Edicao(int idEdicao, int ano, int paginas, String isbn, Editora editora) {
        this.idEdicao = idEdicao;
        this.ano = ano;
        this.paginas = paginas;
        this.isbn = isbn;
        this.editora = editora;
    }

    public int getIdEdicao() {
        return idEdicao;
    }

    public void setIdEdicao(int idEdicao) {
        this.idEdicao = idEdicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}