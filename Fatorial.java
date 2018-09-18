
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int fat = 1;
        int fat2 = 1;
        System.out.println("Digite um valor");
        int fatorial1 = tcl.nextInt();
        System.out.println("Digite outro valor");
        int fatorial2 = tcl.nextInt();
        int saida1 = 1;
        int saida2 = 1;

        for (int num1 = 2; num1 <= fatorial1; num1++) {
            fat *= num1;
            saida1 = fat;
        }
        System.out.println("O fatorial de " + fatorial1 + " é igual a " + fat);

        for (int num2 = 2; num2 <= fatorial2; num2++) {
            fat2 *= num2;
            saida2 = fat2;
        }
        System.out.println("O fatorial de " + fatorial2 + " é igual a " + fat2);
        System.out.println("E a soma dos dois fatoriais é " + (saida1 + saida2));
    }
}
