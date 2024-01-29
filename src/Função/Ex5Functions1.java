//Desenvolver uma estrutura modular com uma função que recebe através de parâmetro um número inteiro e retorna
//	um valor booleano indicando se o número corresponde a um ano bissexto. Um ano é bissexto quando for divisível
//por 4 e não for divisível por 100. Também são bissextos os divisíveis por 400.
 
package Função;

import java.util.Scanner;

public class Ex5Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Este código te mostrará se o ano inserido é ou não, um ano bissexto");
		System.out.print("Insira um ano: ");
		int ano = sc.nextInt();

		ano = bissexto(ano);

		sc.close();

	}

	public static int bissexto(int ano) {
		if (ano % 400 == 0) {
			System.out.println("O ano " + ano + " é um ano bissexto ");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O ano " + ano + " é um ano bissexto");
			} else {
				System.out.println("O ano " + ano + " não é um ano bissexto");
			}
		} else {
			System.out.println("O ano " + ano + " é um ano bissexto");
		}
		return ano;
	}
}
