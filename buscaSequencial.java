
import java.util.Scanner;
import java.util.Random;

public class buscaSequencial {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        Random aleatorios = new Random();

        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorios.nextInt();

        }
        System.out.println("digite o valor a ser procurado"
                + "");
        int valores = tcl.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (valores == vetor[i]) {
                System.out.println("Valor encontrado");
                break;
            }
            if (valores != vetor[i]) {
                System.out.println("Valor não encontrado ");
                break;
            }
        }
    }
}
