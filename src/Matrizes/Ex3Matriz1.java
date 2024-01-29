package Matrizes;

import java.util.Scanner;

public class Ex3Matriz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        String numerosConvertidos = "";

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                matriz[i][i2] = sc.nextInt();

                if (matriz[i][i2] == 0) {
                    System.out.println("Este número já equivale a 0.");
                } else if (matriz[i][i2] > 0) {
                    System.out.println("Este é um número positivo.");
                } else {
                    System.out.println("Este é um número negativo e foi transformado para 0.");
                    numerosConvertidos += matriz[i][i2] + ", ";
                    matriz[i][i2] = 0;
                }
            }
        }

        System.out.println("Valores da matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                System.out.println(matriz[i][i2] + " ");
            }
            System.out.println();
        }

        if (!numerosConvertidos.isEmpty()) { //Ver se há alguma varíavel guardada
            numerosConvertidos = numerosConvertidos.substring(0, numerosConvertidos.length() - 2);
            System.out.println("Os seguintes números foram convertidos para zero: " + numerosConvertidos);
        } else {
            System.out.println("Nenhum número foi convertido para zero.");
		}
        sc.close();
	}
}