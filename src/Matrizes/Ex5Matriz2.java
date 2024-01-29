package Matrizes;

import java.util.Scanner;

public class Ex5Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double matriz[][] = new double [3][4];
		double superior = 0.0, inferior = 0.0;
		
		for (int i = 0; i < 3; i++) {
			for (int i2 = 0; i2 < 4; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();
				
			if ( i == 0 && i2 == 0) {
				superior = matriz[i][i2];
			}
			if ( i == 2 && i2 == 0) {
				inferior = matriz[i][i2];
			}
			}
		}
		System.out.println("O canto superior esquerdo esta alojando o número " + superior);
		System.out.println("O canto inferior esquerdo esta alojando o número " + inferior);
		sc.close();
	}
}
