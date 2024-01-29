//Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da 
//esquerda para a direita. Exemplo: 545; 97379; 123454321; etc. Escreva uma função que, recebendo como parâmetro
//um número inteiro, retorne este número escrito ao contrário. A seguir, implementar uma estrutura modular que
//determine e escreva, usando a função implementada, todos os números palíndromos entre 1000 e 10000.

package Função;

import java.util.Scanner;

public class Ex7Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Números palíndromos entre 1000 e 10000:");
		for (int i = 1000; i <= 10000; i++) {
			if (Palindromo(i)) {
				System.out.println(i + " é palíndromo");
			}
		}
	}

	public static boolean Palindromo(int numero) {
		return numero == inverterNumero(numero);
	}

	public static int inverterNumero(int n) {
		int numInvertido = 0;
		while (n != 0) {

			numInvertido = (numInvertido * 10) + (n % 10);

			n = n / 10;
		}

		return numInvertido;
	}
}