package Arrays;

import java.util.Scanner;

public class Ex2Array1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero[] = new int[6];
		int numeroPar[] = new int[6];
		int numeroImpar[] = new int[6];
		int quantosNumerosPares = 0, quantosNumerosImpares = 0;
		
		for ( int cont = 0; cont < 6; cont++ ) {
			System.out.println("Digite um número: ");
			numero[cont] = sc.nextInt();
			
			if (numero[cont] % 2 == 0) {
				numeroPar[quantosNumerosPares] = numero[cont];
				quantosNumerosPares++;
			} else {
				numeroImpar[quantosNumerosImpares] = numero[cont];
				quantosNumerosImpares++;
			}
		}
		System.out.println("A quantidade de pares é de: " + quantosNumerosPares);
		for ( int cont = 0; cont < quantosNumerosPares; cont++) {
			System.out.println( "Sendo os pares os números: " + numeroPar[cont]);
		}
		System.out.println("A quantidade de ímpares é de: " + quantosNumerosImpares);
		for ( int cont = 0; cont < quantosNumerosImpares; cont++) {
			System.out.println("Sendo os ímpares os números: " + numeroImpar[cont]);
		}
		sc.close();
		}
	}
