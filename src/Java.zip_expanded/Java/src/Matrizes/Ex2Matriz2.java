package Matrizes;

import java.util.Scanner;

public class Ex2Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[7][4];
		int maiorNumero = 0, menorNumero = Integer.MAX_VALUE, linhaY = 0, colunaX = 0, linhaY2 = 0, colunaX2 = 0;

		for (int i = 0; i < 7; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();

				if (maiorNumero < matriz[i][i2]) {
					maiorNumero = matriz[i][i2];
					linhaY = i;
					colunaX = i2;

				}
				if  (menorNumero > matriz[i][i2]) {
					menorNumero = matriz[i][i2];
					linhaY2 = i;
					colunaX2 = i2;

				}
			}
		}
		System.out.println("O maior valor encontrado na matriz foi " + maiorNumero + " na linha " + ( linhaY + 1 ) + " na coluna " + ( colunaX + 1 ));
		System.out.println("O menor valor encontrado na matriz foi " + menorNumero + " na linha " + ( linhaY2 + 1 ) + " na coluna " + ( colunaX2 + 1 ));
		sc.close();
	}
}
