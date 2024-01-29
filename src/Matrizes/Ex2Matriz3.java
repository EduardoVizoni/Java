package Matrizes;

import java.util.Scanner;

public class Ex2Matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = 0;

        System.out.println("Digite o tamanho da matriz: ");
        length = sc.nextInt();

        int matriz[][] = new int[length][length];
        int diagonalSecundariaMatriz = length - 1; // Ajuste para iniciar da última coluna.

        for (int i = 0; i < matriz.length; i++) {
            for (int i2 = 0; i2 < matriz[i].length; i2++) {
                if (i == i2 || i2 == diagonalSecundariaMatriz) {
                    System.out.printf("%d\t", 1);//Formatação.
                } else {
                    System.out.printf("%d\t", 0);//Formatação.
                }
            }
            diagonalSecundariaMatriz--; // Atualiza para a próxima coluna da diagonal secundária.
            System.out.println(); // Nova linha para a próxima linha da matriz.
        }
        sc.close();
    }
}