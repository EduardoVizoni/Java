package Matrizes;

import java.util.Scanner;

public class Ex4Matriz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linhaY = 0, colunaX = 0;
		int matriz[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {// Linha
			for (int i2 = 0; i2 < 6; i2++) {// Coluna
				System.out.print("Digite o valor para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();

			}
		}
		
		@SuppressWarnings("unused")
		boolean encontrado = false;
		
		System.out.println("Digite o valor que deseja buscar dentro da matriz escrita: ");
		int numeroDesejado = sc.nextInt();
		for (int i = 0; i < 6; i++) {
			for (int i2 = 0; i < 6; i2++) {
			
				
				if (numeroDesejado == matriz[i][i2]) {
					
					linhaY = i;
					colunaX = i2;
					encontrado = true;//boolean
							
				} 
				else {
					
				}
			}
		}
		if (encontrado = true) {
			System.out.println("O número " + numeroDesejado + " foi encontrado na linha " + (linhaY + 1) + "na coluna " + (colunaX + 1) );
		}
		else {
			System.out.println("Não foi possível encontrar este valor em nossa matriz.");
		}
		sc.close();
	}
}
