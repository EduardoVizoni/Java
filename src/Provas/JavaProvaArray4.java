package Provas;

import java.util.Scanner;

public class JavaProvaArray4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanhoExigido = 0;
		int indiceAtual = 0;
		int vetorIndice[] = new int[tamanhoExigido];
		int quantidadeNumeros = 0;

		System.out.print("Digite o tamanho do vetor de trajetória: ");
		tamanhoExigido = sc.nextInt();
		System.out.println("Digite os números do vetor de trajetória:");
		indiceAtual = sc.nextInt();

		for (int i = 0; i < tamanhoExigido; i++) {
			System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
			vetorIndice[i] = sc.nextInt();
		}

		System.out.print("Digite o índice inicial (entre 1 e " + tamanhoExigido + "): ");
		System.out.print("Digite a quantidade de números a serem exibidos: ");
		System.out.println("Trajetória a seguir:");

		for (int i = 0; i < quantidadeNumeros; i++) {
			if (indiceAtual < 1 || indiceAtual > tamanhoExigido) {
				System.out.println("Índice fora do intervalo. Terminando o programa.");
				break;
			}

			System.out.print(indiceAtual + " ");
			indiceAtual = vetorIndice[indiceAtual - 1];
		}

		sc.close();
	}
}
