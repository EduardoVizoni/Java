package Exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6Java2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new java.util.ArrayList<>();
        
        System.out.println("Digite uma lista de números (termine com 0):");
        int num;

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numeros.add(num);
        }

        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int i : numeros) {
            if (i > 0) {
                somaPositivos += i;
            } else if (i < 0) {
                somaNegativos += i;
            }
        }

        int somaTotal = somaPositivos + somaNegativos;

        int pares = 0;
        int impares = 0;

        for (int i : numeros) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Soma dos números negativos: " + somaNegativos);
        System.out.println("Soma total: " + somaTotal);
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        sc.close();
	}
}