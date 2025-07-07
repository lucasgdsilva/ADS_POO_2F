package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isRunning = true;
        Agenda a = new Agenda();

        while (isRunning) {
            isRunning = menu(a);
        }
    }

    public static boolean menu(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                
                AGENDA TELEFÔNICA
                ------------------------------
                1. Cadastrar um contato
                2. Encontrar contato
                3. Listar todos os contatos
                4. Atualizar contato
                5. Remover contato
                6. Sair do sistema
                ------------------------------
                Digite a opção desejada:\s""");

        int opcaoMenu = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        switch (opcaoMenu) {
            case 1 -> cadastrarContato(agenda);
            case 2 -> encontrarContato(agenda);
            case 3 -> System.out.println(agenda);
            case 4 -> atualizarContato(agenda);
            case 5 -> removerContato(agenda);
            case 6 -> {
                System.out.println("Saindo...");
                return false;
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
        return true;
    }

    public static void cadastrarContato(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome do contato: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do contato (yyyy-mm-dd): ");
        LocalDate dataNasc = LocalDate.parse(scanner.nextLine());

        Contato c = new Contato(nome, sobrenome, dataNasc);
        if (agenda.addContato(c)){
            addEmail(scanner, c);
            addTelefone(scanner, c);
        }
    }

    private static String getRotulo(Scanner scanner) {
        while (true) {
            System.out.print("""
                    
                    ROTULOS
                    ------------------------------
                    1. Pessoal
                    2. Profissional
                    3. Educacional
                    ------------------------------
                    Selecione a opção que representa o rótulo para o cadastro:\s""");

            if (scanner.hasNextInt()) {
                int opcaoRotulo = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer

                return switch (opcaoRotulo) {
                    case 1 -> "Pessoal";
                    case 2 -> "Profissional";
                    case 3 -> "Educacional";
                    default -> {
                        System.out.println("Opção inválida, tente novamente.");
                        yield null;
                    }
                };
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine(); // descarta entrada inválida
            }
        }
    }

    private static void addEmail(Scanner scanner, Contato contato) {
        System.out.print("Digite o email do contato: ");
        String email = scanner.nextLine();
        String rotulo = getRotulo(scanner);
        contato.addEmail(rotulo, email);

        System.out.print("Deseja adicionar outro email [y/N]? ");
        String resposta = scanner.nextLine().toLowerCase();
        if (resposta.equals("y")) {
            addEmail(scanner, contato);
        }
    }

    private static void addTelefone(Scanner scanner, Contato contato) {
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        String rotulo = getRotulo(scanner);
        contato.addTelefone(rotulo, telefone);

        System.out.print("Deseja adicionar outro telefone [y/N]? ");
        String resposta = scanner.nextLine().toLowerCase();
        if (resposta.equals("y")) {
            addTelefone(scanner, contato);
        }
    }

    public static void encontrarContato(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome do contato: ");
        String sobrenome = scanner.nextLine();

        ArrayList<Contato> contatosEncontrados = agenda.findContato(nome, sobrenome);
        for (int i = 0; i < contatosEncontrados.size(); i++) {
            Contato contato = contatosEncontrados.get(i);
            int indiceReal = agenda.getIndiceContato(contato);
            System.out.println("Índice: " + indiceReal);
            System.out.println(contato);
            System.out.println("------------------------------");
        }
    }


    public static void atualizarContato(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Vamos atualizar o cadastro!
                Você sabe o índice do contato?
                1 - Sim
                2 - Não, quero procurar.
                """);
        int resposta = scanner.nextInt();
        scanner.nextLine();

        if (resposta != 1) {
            encontrarContato(agenda);
        }

        System.out.println("""
                O que deseja fazer?
                1 - Adicionar email
                2 - Adicionar telefone
                3 - Alterar email
                4 - Alterar telefone
                5 - Remover telefone
                6 - Remover email
                """);

        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o índice do contato: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        String rotulo;
        switch (opcao) {
            case 1 -> {
                rotulo = getRotulo(scanner);
                System.out.print("Novo email: ");
                String email = scanner.nextLine();
                System.out.println(agenda.addEmail(rotulo, email, indice) ? "Sucesso" : "Erro");
            }
            case 2 -> {
                rotulo = getRotulo(scanner);
                System.out.print("Novo telefone: ");
                String telefone = scanner.nextLine();
                System.out.println(agenda.addTelefone(rotulo, telefone, indice) ? "Sucesso" : "Erro");
            }
            case 3 -> {
                rotulo = getRotulo(scanner);
                System.out.print("Novo email: ");
                String email = scanner.nextLine();
                System.out.println(agenda.updateEmail(rotulo, email, indice) ? "Sucesso" : "Erro");
            }
            case 4 -> {
                rotulo = getRotulo(scanner);
                System.out.print("Novo telefone: ");
                String telefone = scanner.nextLine();
                System.out.println(agenda.updateTelefone(rotulo, telefone, indice) ? "Sucesso" : "Erro");
            }
            case 5 -> {
                rotulo = getRotulo(scanner);
                System.out.println(agenda.removeTelefone(rotulo, indice) ? "Sucesso" : "Erro");
            }
            case 6 -> {
                rotulo = getRotulo(scanner);
                System.out.println(agenda.removeEmail(rotulo, indice) ? "Sucesso" : "Erro");
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    public static void removerContato(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Vamos remover um contato!
                Você sabe o índice do contato?
                1 - Sim
                2 - Não, quero procurar.
                """);

        int resposta = scanner.nextInt();
        scanner.nextLine();

        if (resposta != 1) {
            encontrarContato(agenda);
        }

        System.out.print("Digite o índice do contato: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        System.out.println(agenda.removeContato(indice) ? "Sucesso" : "Erro ao remover.");
    }
}
