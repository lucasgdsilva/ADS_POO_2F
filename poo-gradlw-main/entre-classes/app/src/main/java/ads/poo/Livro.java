package ads.poo;

import java.util.ArrayList;

public class Livro {

    private int idLivro;
    private String titulo;
    private String idioma;
    private ArrayList<Edicao> edicoes;
    private ArrayList<Autor> autores;

    public Livro(int idLivro, String titulo, String idioma, ArrayList<Edicao> edicoes, ArrayList<Autor> autores) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.idioma = idioma;
        this.edicoes = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public Livro(int idLivro, String titulo, String idioma){
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.idioma = idioma;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public void addEdicao(Edicao edicao) {
        this.edicoes.add(edicao);
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(ArrayList<Edicao> edicoes) {
        this.edicoes = edicoes;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("idLivro=").append(idLivro);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", idioma='").append(idioma).append('\'');
        sb.append(", edicoes=").append(edicoes);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }
}
