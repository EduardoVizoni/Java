//Desenvolva uma função que recebe através de parâmetros, duas cadeias de caracteres e retorna verdadeiro se as 
//cadeias são iguais e falso caso contrário. Obs. fazer comparações “caractere por caractere” até definir o valor de retorno.

package Função;

import java.util.Scanner;

public class Ex2Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Digite a primeira cadeia de caracteres: ");
		String cadeia1 = sc.nextLine();
		System.out.print("Digite a segunda cadeia de caracteres: ");
		String cadeia2 = sc.nextLine();
		
		if(igual(cadeia1, cadeia2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		sc.close();
	}
	public static boolean igual(String cadeia1, String cadeia2) {
		 
		boolean result = false;
		int dif = 0;
		
		if (cadeia1.codePointCount(0, cadeia1.length()) == cadeia2.codePointCount(0, cadeia2.length())) {
			for(int i = 0; i < cadeia1.codePointCount(0, cadeia1.length()); i++) {
				int c2 = cadeia2.codePointAt(i);
				int c1 = cadeia1.codePointAt(i);
				
				if (c1 != c2) {
					dif++;
				}
			}
			if (dif == 0) {
				result = true;
			}
		} else {
			result = false;
			
		}
		return result;
	}
}
