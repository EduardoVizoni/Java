//Desenvolva uma estrutura modular com uma função que recebe através de parâmetro um número inteiro positivo e retorna à quantidade de dígitos deste número.

package Função;

import java.util.Scanner;

public class Ex4Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Insira um valor inteiro e positivo: ");
		int num = sc.nextInt();
		
		int result = quantidade(num);
		System.out.println("A quantidade de dígitos neste número é de " + result);
	}

	public static int quantidade(int num) {
		String numString = Integer.toString(num);

		return numString.length();
	}
}
