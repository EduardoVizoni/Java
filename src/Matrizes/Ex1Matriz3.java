package Matrizes;

import java.util.Scanner;

public class Ex1Matriz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				System.out.print(matriz[i][i2] + "\t");
			}
			System.out.println();
		}

		System.out.println("Os elementos retirados da diagonal principal ");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.print("\n");

		System.out.println(" A nova matriz gerada com a exclusão da diagonal principal é: ");

		// Aqui aprendi a formatar e tabela
		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				if (i != i2) {
					System.out.print(matriz[i][i2] + "\t");
				}
			}
			System.out.print(" ");
		}
		sc.close();
	}
}