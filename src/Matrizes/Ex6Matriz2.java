package Matrizes;

import java.util.Scanner;

public class Ex6Matriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int[7][8];
		
		for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
            	System.out.print("Digite um valor inteiro para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();
            }
        }
		
		System.out.println("A nova matriz gerada é: ");

        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                System.out.print(matriz[i][i2] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}

