package Provas;

import java.util.Scanner;

public class JavaProvaMatrizSudoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de jogadores: ");
		int jogadores = sc.nextInt();

		int sudoku[][] = new int[9][9];
		int resposta[][] = new int[9][9];

		// Fazendo a moldura do "tabuleiro", se é assim que posso chamar.
		for (int i = 0; i < jogadores; i++) {
			System.out.print("Insira o nome do " + (i + 1) + "° jogador: ");
			String nome = sc.next();

			System.out.print("Sudoku de: " + nome + "\n");

			for (int j = 0; j < 1; j++) {
				System.out.println("    0   1   2   3   4   5   6   7   8");
				System.out.println("  _____________________________________ ");
				for (int k = 0; k < 9; k++) {
					System.out.print(k + " | ");
					for (int l = 0; l < 9; l++) {
						System.out.print(sudoku[k][l] + " | ");
					}
					System.out.println();
					System.out.println("  _____________________________________ ");
				}
			}

			System.out.println("Insira suas respostas a seguir na ordem a baixo: ");
			for (int m = 0; m < 9; m++) {
				for (int n = 0; n < 9; n++) {
					System.out.print("[ " + (m + 1) + " ]" + " [ " + (n + 1) + " ] :");
					resposta[m][n] = sc.nextInt();// Resposta é igual o número que ele coloca.
				}
			}
			// Imprimindo a saída dos valores.
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					System.out.print(resposta[linha][coluna] + " ");
					if (coluna == 2 || coluna == 5 && coluna < 8) { // Matriz vai de 0 a 8(total 9), então o 3° número
																	// esta na coluna 2, o sexto na quinta e o nono na
																	// oitava coluna.
						System.out.print("| ");
					}
				}
				System.out.println();
				if (linha == 2 || linha == 5 && linha < 8) {
					System.out.println("------+-------+------");
				}
			}

			int incorreto = 0;

			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					for (int coluna2 = coluna + 1; coluna2 < 9; coluna2++) {
						if (resposta[linha][coluna] == resposta[linha][coluna2]) {
							incorreto++;
						}
					}
					for (int linha2 = linha + 1; linha2 < 9; linha2++) {
						if (resposta[linha][coluna] == resposta[linha2][coluna]) {
							incorreto++;
						}
					}
				}
			}

			if (incorreto == 0) {
				System.out.println();// Formatação para deixar bonito.
				System.out.println("SIM" + "\n");
			} else {
				System.out.println();
				System.out.println("NÃO" + "\n");
			}
		}
		sc.close();
	}
}
