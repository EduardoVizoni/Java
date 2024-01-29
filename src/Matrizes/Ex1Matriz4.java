package Matrizes;

import java.util.Scanner;

public class Ex1Matriz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		
		
		System.out.println("Digite os números da sua matriz 5x5: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int i2 = 0; i2 < matriz.length; i2++) {
				System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int i2 = 0; i2 < 5; i2++) {
				System.out.print(matriz[i][i2] + "\t");
			}
			System.out.println();
		}

		System.out.println("Extremidades:");
		System.out.println("Superior esquerdo: " + matriz[0][0]);
		System.out.println("Superior direito: " + matriz[0][4]);
		System.out.println("Meio da matriz: " + matriz[2][2]);
		System.out.println("Inferior esquerdo: " + matriz[4][0]);
		System.out.println("inferior direito: " + matriz[4][4]);
		sc.close();
	}
}