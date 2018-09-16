
import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = tcl.nextInt();
        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
            if (divisores > 2) {
                break;
            }
        }
        if (divisores == 2) {
            System.out.println("O número " + num + " é primo!");
        } else {
            System.out.println("O número " + num + " não é primo!");
        }

    }
}
