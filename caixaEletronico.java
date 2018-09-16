
import java.util.Scanner;

public class caixaEletronico {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        int acao, continuar = 1;

        System.out.println("Bem vindo");

        while (continuar == 1) {
            System.out.print("1. ver saldo" + "  ");
            System.out.print("2. sacar" + "  ");
            System.out.print("3. depositar" + "  ");
            System.out.println("4. sair");
            System.out.println("Digite uma ação");
            acao = tcl.nextInt();

            switch (acao) {
                case 1:
                    System.out.println("Seu saldo é de " + saldo);
                    break;
                case 2:
                    System.out.println("Digite a quantidade que deseja sacar");
                    saldo -= tcl.nextDouble();
                    System.out.println("Aguarde o seu dinheiro na boca do caixa.");
                    break;
                case 3:
                    System.out.println("Digite a quantidade a ser depositada");
                    saldo += tcl.nextDouble();
                    break;
                case 4:
                    continuar = 0;
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("Digite uma ação válida");

            }

        }
    }
}
