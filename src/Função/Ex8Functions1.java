//Baseie-se na série de Fibonacci formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc. Desenvolver uma estrutura
//modular com uma função que recebe através de parâmetro um número indicando a posição do termo e retorna o valor correspondente na sequência de Fibonacci.
	
package Função;

import java.util.Scanner;

public class Ex8Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor de uma posição para descobrir o número na sequência: ");
		int num = sc.nextInt();

		num = fibonacci(num);
		sc.close();
	}

	public static int fibonacci(int num) {
		int vetor[] = new int[num];

		vetor[0] = 1;
		vetor[1] = 1;

		for (int i = 0; i < num; i++) {
			if (i == 0 || i == 1) {
			} else {
				vetor[i] = vetor[i - 1] + vetor[i - 2];
			}

		}
		
		System.out.println("O valor da posição " + num + "° é o " + vetor[num-1]);
		return num;
	}
}
