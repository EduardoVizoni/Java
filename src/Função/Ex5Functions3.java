//Desenvolva uma estrutura modular que imprima os números primos compreendidos entre 10 e 100. Implemente uma função que verifica se um dado número é primo ou não.

package Função;

import java.util.Scanner;

public class Ex5Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i = 10; i <= 100; i++) {
			if (primo(i))
				System.out.println(i + " é primo.");
		}
	}

	public static boolean primo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}
