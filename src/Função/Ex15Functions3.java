package Função;

import java.util.Scanner;

public class Ex15Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] dezenasSorteadas = new int[5];
		
		System.out.println("Digite as cinco dezenas sorteadas:");
		for (int i = 0; i < 5; i++) {
			dezenasSorteadas[i] = sc.nextInt();
		}

		int tresDezenas = 0;
		int quadra = 0;
		int quina = 0;

		System.out.println("Digite as apostas (formato: número quantidade_dezenas dezenas_apostadas):");
		while (true) {
			int numeroAposta = sc.nextInt();
			if (numeroAposta == 0) {
				break;
			}

			int quantidadeDezenas = sc.nextInt();
			int[] dezenasApostadas = new int[quantidadeDezenas];
			for (int i = 0; i < quantidadeDezenas; i++) {
				dezenasApostadas[i] = sc.nextInt();
			}

			int pontos = avaliarAposta(dezenasSorteadas, dezenasApostadas);
			if (pontos == 3) {
				tresDezenas++;
				System.out.println("Aposta " + numeroAposta + " acertou 3 dezenas.");
			} else if (pontos == 4) {
				quadra++;
				System.out.println("Aposta " + numeroAposta + " acertou 4 dezenas.");
			} else if (pontos == 5) {
				quina++;
				System.out.println("Aposta " + numeroAposta + " acertou 5 dezenas.");
			}
		}

		System.out.println("Quantidade de apostadores com 3 dezenas: " + tresDezenas);
		System.out.println("Quantidade de apostadores com 4 dezenas: " + quadra);
		System.out.println("Quantidade de apostadores com 5 dezenas: " + quina);

		sc.close();
	}

	public static int avaliarAposta(int[] dezenasSorteadas, int[] dezenasApostadas) {
		int pontos = 0;
		for (int dezenaApostada : dezenasApostadas) {
			for (int dezenaSorteada : dezenasSorteadas) {
				if (dezenaApostada == dezenaSorteada) {
					pontos++;
					break;
				}
			}
		}
		return pontos;
	}

}
