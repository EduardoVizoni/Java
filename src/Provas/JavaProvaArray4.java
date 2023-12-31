package Provas;

import java.util.Scanner;

public class JavaProvaArray4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanhoExigido = sc.nextInt();
		int indiceAtual = sc.nextInt();
		int vetorIndice[] = new int[tamanhoExigido];
		int quantidadeNumeros = sc.nextInt();

		System.out.print("Digite o tamanho do vetor de trajetória: ");
		System.out.println("Digite os números do vetor de trajetória:");

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
