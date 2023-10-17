package Matrizes;

import java.util.Scanner;

public class Ex1Matriz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linhas = 0, colunas = 0, escolha;

		do {
			System.out.println("Qual tipo de operação voce deseja concluir?");
			System.out.println("1	Soma");
			System.out.println("2	Subtração");
			System.out.println("3	Multiplicação");
			System.out.println("0	Sair");
			escolha = sc.nextInt();
			if (escolha != 0) {

				System.out.print("Digite o número de linhas: ");
				linhas = sc.nextInt();
				System.out.print("Digite o número de colunas: ");
				colunas = sc.nextInt();

				int matrizA[][] = new int[linhas][colunas];
				int matrizB[][] = new int[linhas][colunas];
				int matrizSoma[][] = new int[linhas][colunas];
				int matrizSub[][] = new int[linhas][colunas];
				int matrizMulti[][] = new int[linhas][colunas];

				for (int i = 0; i < linhas; i++) {
					for (int i2 = 0; i2 < colunas; i2++) {
						System.out
								.print("Insira o valor da linha " + (i + 1) + " coluna " + (i2 + 1) + " da matriz A: ");
						matrizA[i][i2] = sc.nextInt();
					}
				}
				for (int i = 0; i < linhas; i++) {
					for (int i2 = 0; i2 < colunas; i2++) {
						System.out
								.print("Insira o valor da linha " + (i + 1) + " coluna " + (i2 + 1) + " da matriz B: ");
						matrizB[i][i2] = sc.nextInt();
					}
				}
				if (escolha == 1) {
					for (int i = 0; i < linhas; i++) {
						for (int i2 = 0; i2 < colunas; i2++) {
							matrizSoma[i][i2] = matrizA[i][i2] + matrizB[i][i2];
						}
					}
					for (int linha1 = 0; linha1 < matrizSoma.length; linha1++) {

						for (int coluna1 = 0; coluna1 < matrizSoma[0].length; coluna1++) {

							System.out.print(matrizSoma[linha1][coluna1] + " ");

						}

						System.out.println(" ");
					}
				}
				if (escolha == 2) {
					for (int i = 0; i < linhas; i++) {
						for (int i2 = 0; i2 < colunas; i2++) {
							matrizSub[i][i2] = matrizA[i][i2] - matrizB[i][i2];
						}
					}
					for (int linha1 = 0; linha1 < matrizSub.length; linha1++) {

						for (int coluna1 = 0; coluna1 < matrizSub[0].length; coluna1++) {

							System.out.print(matrizSub[linha1][coluna1] + " ");

						}

						System.out.println(" ");
					}
				}
				if (escolha == 3) {
					for (int i = 0; i < linhas; i++) {
						for (int i2 = 0; i2 < colunas; i2++) {
							for (int i3 = 0; i3 < colunas; i3++) {
								matrizMulti[i][i2] += matrizA[i][i3] * matrizB[i3][i2];
							}
						}
					}

					System.out.println("Matriz resultante da multiplicação:");
					for (int i = 0; i < linhas; i++) {
						for (int j = 0; j < colunas; j++) {
							System.out.print(matrizMulti[i][j] + " ");
						}
						System.out.println();
					}
				}
				if (escolha == 0) {
				}
			}
		} while (escolha != 0);
		sc.close();
	}
}