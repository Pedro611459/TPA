package prjVetor;

import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner sc = new Scanner(System.in);

        int[] A = new int[TAM];
        int soma = 0;

        System.out.println("Digite " + TAM + " números inteiros para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
            soma += A[i];
        }

        double media = (double) soma / TAM;

        System.out.print("\nVetor A:\n[");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i]);
            if (i < TAM - 1) System.out.print(" ");
        }
        System.out.println("]");

        System.out.printf("\nMédia dos valores de A: %.2f\n", media);

        sc.close();
    }
}
