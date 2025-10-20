package prjVetor;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner sc = new Scanner(System.in);

        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];

        System.out.println("Digite " + TAM + " números inteiros para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite " + TAM + " números inteiros para o vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print("Vetor C (soma de A e B):");
        for (int i = 0; i < TAM; i++) {
            System.out.print(C[i]);
            if (i < TAM - 1) System.out.print(" ");
        }
        System.out.println("]");

        sc.close();
    }
}
