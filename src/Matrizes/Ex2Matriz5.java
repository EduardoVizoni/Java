package Matrizes;

import java.util.Scanner;

public class Ex2Matriz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Digite o número de colunas da matriz: ");
		int colunas = sc.nextInt();

		int matriz[][] = new int[linhas][colunas];

		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int i2 = 0; i2 < colunas; i2++) {
				matriz[i][i2] = sc.nextInt();
			}
		}

		int transposta[][] = new int[colunas][linhas];
		for (int i = 0; i < linhas; i++) {
			for (int i2 = 0; i2 < colunas; i2++) {
				transposta[i2][i] = matriz[i][i2];
			}
		}

		System.out.println("Matriz original:");
		for (int i = 0; i < linhas; i++) {
			for (int i2 = 0; i2 < colunas; i2++) {
				System.out.print(matriz[i][i2] + " ");
			}
			System.out.println();
		}

		System.out.println("Matriz transposta:");
		for (int i = 0; i < colunas; i++) {
			for (int i2 = 0; i2 < linhas; i2++) {
				System.out.print(transposta[i][i2] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
