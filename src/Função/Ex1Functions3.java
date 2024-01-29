//Desenvolva uma estrutura modular com uma função que recebe através de parâmetro uma cadeia de caracteres e 
//retorna verdadeiro se “todos” os caracteres alfabéticos da cadeia são minúsculos e falso caso contrário.

package Função;

import java.util.Scanner;

public class Ex1Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		String frase;
		int maiuscula = 0;
		boolean resultado = false;

		System.out.print("Insira uma cadeia de caractéres: ");
		frase = sc.nextLine();
		
		resultado = letras(frase);
		if ( resultado == true) {
			System.out.println("Todos caractéres são minúsculos");
		} else {
			maiuscula = minuscula(frase);
			System.out.println("Na frase presente há " + maiuscula + " letras maiúsculas");
		}
		sc.close();
	}

	public static boolean letras(String frase) {
		boolean result = false;
		int maiuscula = 0;

		for (int i = 0; i < frase.codePointCount(0, frase.length()); i++) {
			int caractere = frase.codePointAt(i);

			if (Character.isUpperCase(caractere)) {
				maiuscula++;
			} else if (Character.isLowerCase(caractere)) {
				result = true;
			}
		}
		if (maiuscula != 0) {
			result = false;
		}
		return result;
	}

	public static int minuscula(String frase) {
		int quantia = 0;

		for (int i = 0; i < frase.codePointCount(0, frase.length()); i++) {
			int caractere = frase.codePointAt(i);
			if (Character.isUpperCase(caractere)) {
				quantia++;
			}
		}
		return quantia;
	}
}
