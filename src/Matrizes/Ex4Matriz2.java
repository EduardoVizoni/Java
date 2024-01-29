package Matrizes;

import java.util.Scanner;

public class Ex4Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matrizOriginal[][] = new int[5][5];
		int matrizAoCubo[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matrizOriginal[i][i2] = sc.nextInt();

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				matrizAoCubo[i][i2] = matrizOriginal[i][i2] * matrizOriginal[i][i2] * matrizOriginal[i][i2];
			}
		}

		System.out.println("Matriz de cubos:");
		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				System.out.println(matrizAoCubo[i][i2] + " ");
			}
		}
		sc.close();
	}

}
