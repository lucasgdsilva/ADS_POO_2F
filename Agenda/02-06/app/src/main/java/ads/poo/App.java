package ads.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    Agenda agenda = new Agenda();

    public void cadastrar(){
        System.out.println("Digite o Nome: ");
        String nome = sc.nextLine();


        System.out.println("Digite o Sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Data de Nascimento:");
        LocalDate data = LocalDate.parse(sc.nextLine());

        System.out.println("Adicione o Email:");
        String email = sc.nextLine();
        System.out.println("Tipo do Email:");
        String tEmail = sc.nextLine();

        System.out.println("Adicione o Telefone");
        String telefone = sc.nextLine();
        System.out.println("Tipo do Telefone");
        String ttelefone = sc.nextLine();
        sc.nextLine();

        Contato c = new Contato(nome,sobrenome,data);
        c.addEmail(email,tEmail);
        c.addTelefone(telefone,ttelefone);
        agenda.addContatos(c);

        System.out.println("Contato Cadastrado");
    }

    public boolean removerContato(){
        System.out.println("Digite o Indice do Contato: ");
        int i = sc.nextInt();
        sc.nextLine();

        boolean removido = agenda.removeContato(i);

        if (!removido) {
            System.out.println("Contato inválido.");
            return false;
        }
        System.out.println("Contato removido com sucesso.");
        return true;
    }

    public void consultaContato(){
        System.out.println("Digite o Nome: ");
        String nome = sc.nextLine();


        System.out.println("Digite o Sobrenome:");
        String sobrenome = sc.nextLine();


        agenda.findContato(nome,sobrenome);
    }
    public void consultaListaDeContatos(){
        System.out.println(agenda.toString());
    }
    public void atualizarContato(){
        System.out.println("""
                Digite o Numero:
                1- Atualizar Email
                2- Atualizar Telefone
                """);
        int c = sc.nextInt();
        sc.nextLine();
        if(c == 1){
            System.out.println("Atualize o Email:");
            String email = sc.nextLine();
            System.out.println("Tipo do Email:");
            String tEmail = sc.nextLine();
            System.out.println("Digite o Indice do contato");
            int indicee = sc.nextInt();
            sc.nextLine();
            agenda.updateEmail(tEmail,email,indicee);
        } else if (c == 2) {
            System.out.println("Adicione o Telefone");
            String telefone = sc.nextLine();
            System.out.println("Tipo do Telefone");
            String ttelefone = sc.nextLine();
            System.out.println("Digite o Indice do contato");
           int indicet = sc.nextInt();
            sc.nextLine();
            agenda.updateTelefone(ttelefone,telefone,indicet);

        }else{
            System.out.println("Opção invalida");
        }

    }
    public void adicionarET(){
        System.out.println("""
                Digite o Numero:
                1- Adicionar Email
                2- Adicioanar Telefone
                """);
        int c = sc.nextInt();
        sc.nextLine();
        if(c == 1){
            System.out.println("Adicione o Email:");
            String email = sc.nextLine();
            System.out.println("Tipo do Email:");
            String tEmail = sc.nextLine();
            System.out.println("Digite o Indice do contato");
            int indicee = sc.nextInt();
            sc.nextLine();
            agenda.addEmail(tEmail,email,indicee);
        } else if (c == 2) {
            System.out.println("Adicione o Telefone");
            String telefone = sc.nextLine();
            System.out.println("Tipo do Telefone");
            String ttelefone = sc.nextLine();
            System.out.println("Digite o Indice do contato");
            int indicet = sc.nextInt();
            sc.nextLine();
            agenda.addTelefone(ttelefone,telefone,indicet);

        }else{
            System.out.println("Opção invalida");
        }
    }


    public void menu(){
        int c =0;
        while (c != 7) {
            System.out.println(
                    """ __________ Agenda _____________
                                    1- Cadastrar Contato
                                    2- Atulizar Contato
                                    3- Remover Contato
                                    4- Consultar Contato
                                    5- Consutar lista de Contatos
                                    6- Adicionar Email ou Telefone
                                    7- Sair da Agenda    
                            """
            );
            c = sc.nextInt();
            sc.nextLine();
            if (c > 7 || c < 1) {
                System.out.println("Opção Invalida");
            }
            switch (c){
                case 1:
                    cadastrar();;
                    break;
                case 2:
                    atualizarContato();
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    consultaContato();
                    break;
                case 5:
                    consultaListadeContatos();
                    break;
                case 6:
                    adicionarET();
                    break;
            }
        }
    }


    public static void main(String[] args) {

    }
}
