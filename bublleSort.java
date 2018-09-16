/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class bublleSort {

    public static void main(String[] args) {
        System.out.println("vetor não ordnado");
        int vetor[] = {3, 2, 6, 5, 4, 7};
        int num = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor[i] < vetor[j]) {
                    num = vetor[j];
                    vetor[i] = vetor[j];
                    vetor[j] = num;
                }
            }
        }
        System.out.println("vetor ordenado");
    }

};
