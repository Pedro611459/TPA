package prjVetor;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner sc = new Scanner(System.in);

        int[] A = new int[TAM];
        int[] B = new int[TAM];

        System.out.println("Digite " + TAM + " números inteiros para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.print("Vetor B (quadrado dos elementos de A)");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i]);
            if (i < TAM - 1) System.out.print(" ");
        }
        System.out.println("]");

        sc.close();
    }
}
