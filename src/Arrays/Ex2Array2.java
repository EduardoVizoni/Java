package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Quantidade de números: ");
	        int quantidade = sc.nextInt();

	        int numeros[] = new int[quantidade];
	        int pares[];
	        int impares[];

	        for (int i = 0; i < quantidade; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        
	        int numPares = 0;
	        int numImpares = 0;

	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                numPares++;
	            } else {
	                numImpares++;
	            }
	        }

	        pares = new int[numPares];
	        impares = new int[numImpares];

	        int indicePares = 0;
	        int indiceImpares = 0;

	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                pares[indicePares++] = numero;
	            } else {
	                impares[indiceImpares++] = numero;
	            }
	        }


	        Arrays.sort(pares);
	        for (int i = 0; i < numImpares / 2; i++) {
	            int temp = impares[i];
	            impares[i] = impares[numImpares - 1 - i];
	            impares[numImpares - 1 - i] = temp;
	        }
	        
	        int[] resultado = new int[numPares + numImpares];
	        System.arraycopy(pares, 0, resultado, 0, numPares);
	        System.arraycopy(impares, 0, resultado, numPares, numImpares);
	        System.out.println("\nResultado:");
	        for (int num : resultado) {
	            System.out.print(num + " ");
	        }
	        sc.close();
	    }
	}


