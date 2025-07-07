package ads.poo;
public class Disciplina {

    private String materiasPre;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String professor;
    private String periodo;
    private String sala;
    private double anoLetivo;
    private String dias;


    public void definirDisciplina(String d) {
        nomeDisciplina = d;

    }

    public void definirMateriasPre(String m) {
        materiasPre = m;
    }
    public void definirDias (String d) {
            dias = d;
    }

    public void definirCargaHoraria(int ch) {
        cargaHoraria = ch;
    }

    public void definirProfessor(String p) {
        professor = p;
    }

    public void definirPeriodo(String p) {
        periodo = p;
    }

    public void definirSala(String s) {
        sala = s;
    }

    public void definirAnoLetivo(double a) {
        anoLetivo = a;
    }

    public String obterMateriasPre() {
        return materiasPre;
  
    }
    public String obterDias() {
        return dias;
    }
    
    public String obterDisciplina() {
        return nomeDisciplina;
    }

    public int obterCargaHoraria() {
        return cargaHoraria;
    }

    public String obterProfessor() {
        return professor;
    }

    public String obterPeriodo() {
        return periodo;
    }

    public String obterSala() {
        return sala;
    }

    public double obterAnoLetivo() {
        return anoLetivo;
    }
}
