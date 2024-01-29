//Desenvolver uma estrutura modular com uma função que recebe através de parâmetro dois números inteiros e retorna um valor 
//booleano indicando se o primeiro número é múltiplo do segundo.

package Função;

import java.util.Scanner;

public class Ex4Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int multiplo = 0;

		System.out.print("Insira o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo valor: ");
		int num2 = sc.nextInt();
		multiplo = multiplo(num1, num2);

		sc.close();

	}

	public static int multiplo(int num1, int num2) {
		int multiplo = 0;
		if (num2 % num1 == 0) {
			System.out.println("Este número não é múltiplo de " + num2);
		} else {
			System.out.println("Este número é múltiplo de " + num2);
		}
		return multiplo;
	}
}
