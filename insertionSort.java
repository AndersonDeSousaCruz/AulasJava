
import java.util.Arrays;

public class insertionSort {
    
    public static void main(String[] args) {
        int vetor[] = {2, 5, 4, 2, 15, 2, 54, 2, 5, 85, 3, 36, 1, 1, 44, 65, 0, 15877};
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j + 1] < vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        
        System.out.println(Arrays.toString(vetor));
        
    }
}
