package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor(1, "Machado de Assis");
        Autor autor2 = new Autor(2, "Clarice Lispector");

        
        Editora editora = new Editora(1, "Saraiva", "São Paulo");

    
        Edicao edicao1 = new Edicao(1, 2001, 300, "ISBN001", editora);
        Edicao edicao2 = new Edicao(2, 2005, 320, "ISBN002", editora);

        ArrayList<Autor> listaAutores = new ArrayList<>();
        listaAutores.add(autor1);
        listaAutores.add(autor2);

        ArrayList<Edicao> listaEdicoes = new ArrayList<>();
        listaEdicoes.add(edicao1);
        listaEdicoes.add(edicao2);

        
        Livro livro = new Livro(1, "Dom Casmurro", "Português");
        livro.setAutores(listaAutores);
        livro.setEdicoes(listaEdicoes);
        
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Idioma: " + livro.getIdioma());
        System.out.println("Autores:");
        for (Autor autor : livro.getAutores()) {
            System.out.println("- " + autor.getNome());
        }
        System.out.println("Edições:");
        for (Edicao edicao : livro.getEdicoes()) {
            System.out.println("- Ano: " + edicao.getAno() + ", ISBN: " + edicao.getIsbn() +
                    ", Editora: " + edicao.getEditora().getNome());
        }
    }
}