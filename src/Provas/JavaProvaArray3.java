package Provas;

import java.util.Scanner;

public class JavaProvaArray3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero[] = new int[10];
		int valorReferencia = 0, numeroMaior = 0, numeroMenor = 0, numeroIgual = 0;

		System.out.println("Digite um valor como referência: ");
		valorReferencia = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			numero[i] = sc.nextInt();

			if (numero[i] > valorReferencia) {
				System.out.println(
						"Este número é maior que o valor referencial, o número digitado foi " + "\n" + numero[i]);
				numeroMaior++;

			}
			if (numero[i] < valorReferencia) {
				System.out.println(
						"Este número é menor que o valor referencial, o número digitado foi" + "\n" + numero[i]);
				numeroMenor++;

			}
			if (numero[i] == valorReferencia) {
				System.out.println("Este número é igual o valor referencial, o número digitado foi" + "\n" + numero[i]);
				numeroIgual++;

			}
		}
		System.out.println("A quantidade de números maiores que o valor referencial foi de" + "\n" + numeroMaior);
		System.out.println("A quantidade de números menores que o vlaor referencial foi de" + "\n" + numeroMenor);
		System.out.println("A quantidade de números iguais que o valor referencial foi de" + "\n" + numeroIgual);
		sc.close();
	}
}
