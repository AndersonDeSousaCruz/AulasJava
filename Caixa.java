
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        Caixa obj = new Caixa();

        int acao = 1;
        while  (true) {
            obj.menu();
            acao = tcl.nextInt();
            switch (acao) {
                case 1:
                    obj.saldo(saldo);
                    break;
                case 2:
                    saldo = obj.sacar(saldo);
//                    obj.saldo(saldo);
                    break;
                case 3:
                    saldo = obj.depositar(saldo);
//                    obj.saldo(saldo);
                    break;
                case 4:
                    obj.sair();
                    break;
                default:
                    System.out.println("DIGITE UMA AÇÃO VÁLIDA");
            }
        }
    }

    public void menu() {
        System.out.println("1. Ver saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Sair");
    }

    public void saldo(double saldo) {
        System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
    }

    public double sacar(double saldo) {
        System.out.println("Digite  valor que deseja sacar");
        Scanner tcl = new Scanner(System.in);
        double valor = tcl.nextDouble();
        return saldo - valor;

    }

    public double depositar(double saldo) {
        System.out.println("Digite o valor que deseja depositar");
        Scanner tcl = new Scanner(System.in);
        double valor = tcl.nextDouble();
        return saldo + valor;
    }
    public void sair(){
        System.out.println("Deseja realmente sair? se sim, digite 1. Se não digite 2." );
        Scanner tcl = new Scanner(System.in);
        int valor = tcl.nextInt();
        if(valor == 1){
            System.exit(0);
        }
        
    }
}
