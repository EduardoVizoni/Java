package Matrizes;

import java.util.Scanner;

public class Ex2Matriz4 {
	public static void main(String[] args) {
		char tabuleiro[][] = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		char jogadorAtual = 'X';

		Scanner sc = new Scanner(System.in);

		for (int jogada = 0; jogada < 9; jogada++) {
			System.out.println("  0 1 2");
			System.out.println(" -------");
			for (int i = 0; i < 3; i++) {
				System.out.print(i + "|");
				for (int i2 = 0; i2 < 3; i2++) {
					System.out.print(tabuleiro[i][i2] + "|");
				}
				System.out.println();
				System.out.println(" -------");
			}

			System.out.println("Jogador " + jogadorAtual + ", faça a sua jogada (linha coluna): ");
			int linha = sc.nextInt();
			int coluna = sc.nextInt();

			if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
				tabuleiro[linha][coluna] = jogadorAtual;

				if ((tabuleiro[linha][0] == jogadorAtual && tabuleiro[linha][1] == jogadorAtual
						&& tabuleiro[linha][2] == jogadorAtual)
						|| (tabuleiro[0][coluna] == jogadorAtual && tabuleiro[1][coluna] == jogadorAtual
								&& tabuleiro[2][coluna] == jogadorAtual)
						|| (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
								&& tabuleiro[2][2] == jogadorAtual)
						|| (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual
								&& tabuleiro[2][0] == jogadorAtual)) {
					System.out.println("Jogador " + jogadorAtual + " venceu!");
					break;
				}

				jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
			} else {
				System.out.println("Jogada inválida. Tente novamente.");
			}

			if (jogada == 9) {
				System.out.println("O jogo empatou!");
			}

		}
	}
}