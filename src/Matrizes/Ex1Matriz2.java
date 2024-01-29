package Matrizes;

import java.util.Scanner;

public class Ex1Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		int positivo = 0;
		int media = 0;
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int i2 = 0; i2 < matriz.length; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();

				if (matriz[i][i2] < 0) {
					System.out.println("Este é um número negativo, portante, inválido");
					i2--;
				}
				if (matriz[i][i2] % 2 == 0) {
					positivo++;
					soma = soma + matriz[i][i2];
				}
			}
		}
		media = soma / positivo;
		System.out.println("A média de números pares pertencentes a uma matriz (5,5) é de: " + media);
		sc.close();
	}
}
