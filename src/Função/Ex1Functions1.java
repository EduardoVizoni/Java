//Desenvolver uma estrutura modular com um procedimento que recebe através de parâmetro um número inteiro e apresenta a tabuada deste número. 

package Função;

import java.util.Scanner;

public class Ex1Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.print("Digite um número no qual deseja ver a tabela de multiplicações: ");
		int num = sc.nextInt();
		num = tabela(num);

		sc.close();
	}

	public static int tabela(int num) {
		System.out.println(" 0 x " + num + " = " + (0 * num));
		System.out.println(" 1 x " + num + " = " + (1 * num));
		System.out.println(" 2 x " + num + " = " + (2 * num));
		System.out.println(" 3 x " + num + " = " + (3 * num));
		System.out.println(" 4 x " + num + " = " + (4 * num));
		System.out.println(" 5 x " + num + " = " + (5 * num));
		System.out.println(" 6 x " + num + " = " + (6 * num));
		System.out.println(" 7 x " + num + " = " + (7 * num));
		System.out.println(" 8 x " + num + " = " + (8 * num));
		System.out.println(" 9 x " + num + " = " + (9 * num));
		System.out.println("10 x " + num + " = " + (10 * num));
		return num;
	}
}