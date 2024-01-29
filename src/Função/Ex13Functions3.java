//Desenvolva uma estrutura modular com a função para determinar e retornar o n-ésimo termo da sequência de Fibonacci.

package Função;

import java.util.Scanner;

public class Ex13Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Digite o número de uma posição para ser revelada na sequência de Fibonacci: ");
		int posicao = sc.nextInt();

		int result = calcularFibonacci(posicao);

		System.out.println("O número representado na " + posicao + "º posição da sequência de Fibonacci é: " + result);
	}

	public static int calcularFibonacci(int posicao) {
		if (posicao <= 0) {
			System.out.println("Por favor, insira uma posição válida (maior que zero)!");
			return -1;
		}

		if (posicao == 1) {
			return 0;
		} else if (posicao == 2) {
			return 1;
		}

		int num1 = 0, num2 = 1, resultado = 0;

		for (int i = 3; i <= posicao; i++) {
			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;
		}

		return resultado;
	}
}