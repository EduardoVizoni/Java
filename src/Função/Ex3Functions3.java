//Desenvolva uma estrutura modular com uma função que recebe através de parâmetro a cadeia de caracteres e retorna:
//-1, se existir na cadeia pelo menos um caractere que não seja um caractere numérico e alfabético.
//0, se a quantidade de caracteres numéricos da cadeia for maior ou igual a quantidade de caracteres alfabéticos.
//1, se a quantidade de caracteres alfabéticos da cadeia for maior que quantidade de caracteres numéricos.

package Função;

import java.util.Scanner;

public class Ex3Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int resultado = 0;

		System.out.print("Insira uma cadeia de caracteres: ");
		String frase = sc.nextLine();

		resultado = teste(frase);

		if (resultado == -1) {

			System.out.println("Existe caracter especial.");

		} else if (resultado == 0) {

			System.out.println("Existe mais caracteres numéricos em relação aos alfabéticos.");

		} else if (resultado == 1) {

			System.out.println("Existe mais caracteres alfabéticos em relação aos numéricos.");

		}

		sc.close();

	}

	public static int teste(String frase) {

		int alf = 0, num = 0, nen = 0;

		int result = 0;

		for (int i = 0; i < frase.codePointCount(0, frase.length()); i++) {

			int c = frase.codePointAt(i);

			if (Character.isLetter(c)) {

				alf++;

			} else if (Character.isDigit(c)) {

				num++;

			} else {

				nen++;

			}

		}

		if (nen != 0) {

			result = -1;

		} else if (num > alf) {

			result = 0;

		} else {

			result = 1;

		}

		return result;

	}

}