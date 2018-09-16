
import java.util.Scanner;

public class buscaBinaria {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE O TAMNHO DO VETOR");
        int tamanho = tcl.nextInt();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;

        }
        int min = vetor[0];
        int max = vetor.length;
        int meio = (min + max) / 2;

        System.out.println("Digite o valor a ser procurado");
        int valor = tcl.nextInt();

        if (valor < meio) {
            for (int i = 0; i < vetor.length; i++) {
                if (valor == vetor[i]) {
                    System.out.println("O valor está na posição" + i);
                }
            }
        } else if (valor > meio) {
            for (int i = 0; i < vetor.length; i++) {
                if (valor == vetor[i]) {
                    System.out.println("O valor está na posição " + i);
                }
            }
        } else if (valor == meio) {
            System.out.println("O valor está na posição " + meio);
        }
    }
}
