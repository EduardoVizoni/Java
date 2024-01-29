//Desenvolver uma estrutura modular com uma função que recebe através de parâmetro um número inteiro e retorna o valor absoluto (positivo) deste número.

package Função;

import java.util.Scanner;

public class Ex2Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorAbsoluto;

		System.out.println("Insira um valor inteiro: ");
		int num = sc.nextInt();

		valorAbsoluto = valorAbsoluto(num);
		System.out.println(valorAbsoluto + " é o valor absoluto do número inserido: ");

		sc.close();
	}

	public static int valorAbsoluto(int num) {
		int valorAbsoluto;

		if (num < 0) {
			valorAbsoluto = (-num);
		} else {
			valorAbsoluto = num;
		}
		return valorAbsoluto;
	}
}
