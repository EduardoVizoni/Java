package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex7Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator= new Random();
		
		int sorteado[] = new int [6];
		int escolha;
		int ganhador = 0;
		
		for ( int i = 0; i < 6; i++) {
			sorteado[i] = generator.nextInt(61);
		
			for ( int i2 = 0; i2 < i; i2++) {
				if ( sorteado[i2] == sorteado[i]) {
					i++;
					
				}
			}
		}
		
		for ( int i3 = 0; i3 < 6; i3++) {
			System.out.println("Insira o " + (i3 + 1) + "° número: ");
			escolha = sc.nextInt();
			
			for ( int i4 = 0; i4 < 6; i4++) {
				if( escolha	== sorteado[i4] ) {
					ganhador++;
				}
				else {
					
				}
			}
		}
		System.out.println(Arrays.toString(sorteado));
		System.out.println("A quantidade de números que você acertou foi de: " + ganhador);
		sc.close();
	}
}
