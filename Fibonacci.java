
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite uma posição");
        int valor = tcl.nextInt();
        int a = 0;
        int b = 1;
        int aux = 0;
        for (int i = 0; i < valor; i++) {
            aux = a;
            a = a + b;
            b = aux;
            System.out.print(aux+" ");
        }
        System.out.println("");
        if(valor == 1) {
            System.out.println("0");
        } else {
            System.out.println(aux);
        }
        
    }
}
