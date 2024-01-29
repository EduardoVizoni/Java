//Desenvolver uma estrutura modular com uma função que recebe através de parâmetro um número inteiro e retorna o fatorial deste número.

package Função;

import java.util.Scanner;

public class Ex7Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número inteiro para ver o seu número fatorial: ");
		int num = sc.nextInt();

		num = fatorial(num);

		sc.close();
	}

	public static int fatorial(int num) {
		int mult = 1;
		for (int i = 1; i <= num; i++) {
			mult *= i;
		}

		System.out.println("O número " + num + " em fatorial é " + mult);
		return num;
	}
}
