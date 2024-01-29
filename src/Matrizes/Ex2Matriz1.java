package Matrizes;

import java.util.Scanner;

public class Ex2Matriz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {// Linha, primeiro sempre linha.
			for (int i2 = 0; i2 < 5; i2++) {// Coluna, segundo sempre coluna.
				System.out.print("Digite o valor para a posição da linha " + (i + 1) + (" coluna ") + (i2 + 1) + ": ");
				matriz[i][i2] = sc.nextInt();

				for (int i3 = 0; i3 < 5; i3++) {
					for (int i4 = 0; i4 < 5; i4++) {
						if (i != i3 || i2 != i4) {
							if (matriz[i][i2] == matriz[i3][i4]) {
								System.out.println("O número inserido é o mesmo ao que pertence a linha " + (i3 + 1)
										+ " coluna " + (i4 + 1));
							}
						} 
						else {
						}
					}
				}

			}
		}
		sc.close();
	}
}
