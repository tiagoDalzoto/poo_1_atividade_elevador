import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador e = new Elevador(10);

        int opcao;

        do {
            System.out.println(" 1 - Subir \n 2 - Descer \n 3 - Sair \n 4- Fechar porta " +
                    "\n 5 - Andar Atual \n 6 - estado da porta" );

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    e.subir();
                    break;
                case 2:
                    e.descer();
                    break;
                case 3:
                    e.abrirPorta();
                    break;
                case 4:
                    e.fecharPorta();
                    break;
                case 5:
                    e.qualAndarAtual();
                    break;
                case 6:
                    e.estadoPorta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}