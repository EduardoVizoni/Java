package Provas;

import java.util.Scanner;

public class JavaProvaArray2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho = 20;
		int primeiroVetor[] = new int[20];
		int segundoVetor[] = new int[20];
		int terceiroVetor[] = new int[40];

		System.out.println("Preencha o primeiro vetor com " + 20 + " números da sua escolha:");

		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o número na posição " + i + ": ");
			primeiroVetor[i] = sc.nextInt();
		}

		System.out.println("Preencha o segundo vetor com " + 20 + " números:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o número na posição " + i + ": ");
			segundoVetor[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			terceiroVetor[i * 2] = primeiroVetor[i];
			terceiroVetor[i * 2 + 1] = segundoVetor[i];
		}

		System.out.println("Aqui esta o resutlado do terceiro vetor com valores intercalados:");
		for (int i = 0; i < terceiroVetor.length; i++) {
			System.out.println("Posição " + i + ": " + terceiroVetor[i]);
		}

		sc.close();
	}
}