package Matrizes;

import java.util.Scanner;

public class ExampleMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];//Declarando a varíavel da matriz.
		
		for (int i = 0; i < 4; i++) { //Linha = i.
			for (int i2 = 0; i2 < 4; i2++) { //Coluna = i2.
				System.out.println("Digite um valor: ");
				matriz [i][i2] = sc.nextInt(); //matriz[LINHA][COLUNA].
				
			}
		}
		sc.close();
	}

}
