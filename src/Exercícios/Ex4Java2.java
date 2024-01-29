package Exercícios;

import java.util.Scanner;

public class Ex4Java2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ganhador = 0, jogadorUm = 1, jogadorDois = 1, pontos = 0;

		do {
			System.out.println("Digite o número do jogador: ");
			pontos = sc.nextInt();
			if (pontos == 1) {
				System.out.println("O jogador 1 marcou um ponto!, ele tem: " + jogadorUm + " ponto(s)");
				jogadorUm++;
			} else if (pontos == 2) {
				System.out.println("O jogador 1 marcou um ponto!, ele tem: " + jogadorDois + " ponto(s)");
			} else {
				System.out.println("ERRO");
			}
			if (jogadorUm >= 21 || jogadorDois >= 21) {
				if (jogadorUm > jogadorDois + 2) {
					System.out.println("Jogador um foi o grande vencedor da vez! ");
					ganhador = 1;
				}

				else if (jogadorDois > jogadorUm + 2) {
					System.out.println("Jogador dois foi o grande vencedor da vez! ");
					ganhador = 1;
				}

			}
		} while (ganhador == 0);
		sc.close();
	}
}
