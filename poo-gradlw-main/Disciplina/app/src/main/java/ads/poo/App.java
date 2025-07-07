package ads.poo;

import java.util.Arrays;
public class App {

    public static void main(String[] args) {
        Disciplina poo = new Disciplina();

        poo.definirAnoLetivo(2025.1);
        poo.definirCargaHoraria(80);
        poo.definirPeriodo("Noturno");
        poo.definirProfessor("Emerson Mello");
        poo.definirSala("LabRedes");
        poo.definirDisciplina("Programação Orientada a Objetos");
        poo.definirDias("Segunda e Quinta");
        poo.definirMateriasPre("Algoritmos, Introdução a Computação");

        System.out.println("Disciplina: " + poo.obterDisciplina());
        System.out.println("Professor: " + poo.obterProfessor());
        System.out.println("Sala: " + poo.obterSala());
        System.out.println("Dias: " + poo.obterDias());
        System.out.println("Ano Letivo: " + poo.obterAnoLetivo());
        System.out.println("Periodo: " + poo.obterPeriodo());
        System.out.println("Carga Horaria: " + poo.obterCargaHoraria());
        System.out.println("Materias pré-requisito: " + poo.obterMateriasPre());
        
        

    }
}
