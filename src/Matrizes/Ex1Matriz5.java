package Matrizes;

import java.util.Scanner;

public class Ex1Matriz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da matriz quadrada: ");
		int tamanho = sc.nextInt();

		int matriz[][] = new int[tamanho][tamanho];

		for (int i = 0; i < tamanho; i++) {
			for (int i2 = 0; i2 < tamanho; i2++) {
				System.out.print("Digite o valor para a posição [" + i + "][" + i2 + "]: ");
				matriz[i][i2] = sc.nextInt();
			}
		}

		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		for (int i = 0; i < tamanho; i++) {
			somaDiagonalPrincipal += matriz[i][i];
			somaDiagonalSecundaria += matriz[i][tamanho - 1 - i];
		}

		System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
		sc.close();
	}
}