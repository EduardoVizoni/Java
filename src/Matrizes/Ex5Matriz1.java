package Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5Matriz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[4][4];
		int diagonal[] = new int[4];

		System.out.println("Insira os valores para a matriz");
		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				System.out.println("Insira o valor da linha " + (i + 1) + " coluna " + (i2 + 1));
				matriz[i][i2] = sc.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				if ( i == i2) {
					diagonal[i] = matriz[i][i2];
				}
			}
		}
		System.out.println("Os valores obtidos da diagonal principal são: " + Arrays.toString(diagonal));
		System.out.println("Já, a matriz sem os números da diagonal principal, será: ");
		
		for ( int i = 0; i < matriz.length; i++) {
			for (int i2 = 0; i2 < matriz.length; i2++) {
				if ( i != i2) {
					System.out.print(matriz[i][i2] + " ");
				}
				else {
					System.out.print("ø" + " ");
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}
}