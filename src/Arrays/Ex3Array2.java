package Arrays;

import java.util.Scanner;

public class Ex3Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanho = 20;
		int vetor1[] = new int[tamanho];
		int vetor2[] = new int[tamanho];
		int diferenca[] = new int[tamanho];
		int soma[] = new int[tamanho];
		int multiplicacao[] = new int[tamanho];


		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = sc.nextInt();
		}

		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = sc.nextInt();
		}


		for (int i = 0; i < tamanho; i++) {
			diferenca[i] = vetor1[i] - vetor2[i];
			soma[i] = vetor1[i] + vetor2[i];
			multiplicacao[i] = vetor1[i] * vetor2[i];
		}

		System.out.println("Diferença:");
		exibirVetor(diferenca);

		System.out.println("\nSoma:");
		exibirVetor(soma);
		
		System.out.println("\nMultiplicação:");
		exibirVetor(multiplicacao);
		
		sc.close();
	}

	public static void exibirVetor(int[] vetor) {
		for (int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
} 



