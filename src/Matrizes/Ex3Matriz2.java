package Matrizes;

import java.util.Scanner;

public class Ex3Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matrizM[][] = new int[5][5];
		int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matrizM[i][i2] = sc.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				if (i == 3) {
					somaLinha4 += matrizM[i][i2];
				}
				if (i2 == 1) {
					somaColuna2 += matrizM[i][i2];
				}
				if (i == i2) {
					somaDiagonalPrincipal += matrizM[i][i2];
				}
				if (i + i2 == 4) {
					somaDiagonalSecundaria += matrizM[i][i2];
				}
			}
		}

		System.out.println("A soma obtida pela linha 4 é: " + somaLinha4);
		System.out.println("A soma obtida pela coluna 2 é: " + somaColuna2);
		System.out.println("A soma obtida da diagonal principal é: " + somaDiagonalPrincipal);
		System.out.println("A soma obtida da diagonal secundária é: " + somaDiagonalSecundaria);

		System.out.println("Matriz:");
		for (int i3 = 0; i3 < 5; i3++) {
			for (int i4 = 0; i4 < 5; i4++) {
				System.out.println(matrizM[i3][i4] + " ");
			}
		}
		sc.close();
	}
}
