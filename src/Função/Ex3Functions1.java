////Desenvolver uma estrutura modular com uma função que recebe através de parâmetro um número inteiro e retorna um valor booleano indicando se o número é par ou não.

package Função;

import java.util.Scanner;

public class Ex3Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor inteiro e positivo");
		int num = sc.nextInt();
		num = par(num);

		sc.close();
	}

	public static int par(int num) {
		if (num % 2 == 0) {
			System.out.println("Esse número é par, o número escolhido foi " + num);
		} else {
			System.out.println("Esse número é ímpar, o número escolhido foi " + num);
		}
		return num;
	}

}
