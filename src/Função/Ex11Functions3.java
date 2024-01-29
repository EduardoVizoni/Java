//Escrever uma função que faz criptografia por substituição, ou seja, pega um texto legível e transforma em texto
//cifrado, substituindo os caracteres originais por caracteres que estão "n" posições na frente. Este processo também é 
//conhecido como “Cifra de César”.

package Função;

import java.util.Scanner;

public class Ex11Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String cifraString;

		System.out.printf("Informe um texto:\n");
		String texto = sc.nextLine();

		System.out.printf("\nInforme o valor da cifra:\n");
		int cifra = sc.nextInt();
		
		String decifraString;

		cifraString = criptografa(texto, cifra);
		decifraString = descriptografa(cifraString, cifra);

		System.out.printf("\nTexto criptografado:\n");
		System.out.printf("%s", cifraString);

		System.out.printf("\n\nTexto descriptografado:\n");
		System.out.printf("%s\n", decifraString);
	}

	public static String criptografa(String texto, int cifra) {
		int i, n = texto.length();
		String auxiliar = "";

		for (i = 0; i < n; i++) {
			auxiliar = auxiliar + (char) (texto.charAt(i) + cifra);
		}

		return auxiliar;
	}

	public static String descriptografa(String texto, int cifra) {
		int i, n = texto.length();
		String auxiliar = "";

		for (i = 0; i < n; i++) {
			auxiliar = auxiliar + (char) (texto.charAt(i) - cifra);
		}

		return auxiliar;
	}

}
