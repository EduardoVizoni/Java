//Desenvolva uma estrutura modular com a função para calcular e retornar o fatorial de um número.

package Função;

import java.util.Scanner;

public class Ex12Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Insira um número que deseja saber seu fatorial: ");
		int num = sc.nextInt();

		int result = calcularFatorial(num);

		System.out.println("O fatorial de " + num + " é: " + result);
	}

	public static int calcularFatorial(int num) {
		if (num < 0) {
			System.out.println("Não é possível calcular o fatorial de números negativos!");
			return -1;
		}

		int resultadoFatorial = 1;

		for (int i = num; i > 1; i--) {
			resultadoFatorial *= i;
		}

		return resultadoFatorial;
	}
}