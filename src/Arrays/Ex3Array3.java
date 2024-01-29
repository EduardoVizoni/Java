package Arrays;

import java.util.Scanner;

public class Ex3Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in) ;
		
		int vetorX[] = new int[15];
		
		
		for ( int i = 0; i < vetorX.length; i++) {
			System.out.println("Digite um elemento qualquer: ");
			vetorX[i] = sc.nextInt();
			
			if (vetorX[i] < 1) {
				System.out.println("O número " + vetorX[i] + " foi convertido para 0.");
				vetorX[i] = 0;
		       }
        }

		System.out.print("Vetor com os negativos convertidos para nulos: ");
		for (int elemento : vetorX) {
			System.out.print(elemento + " ");
        }
		sc.close();
    }
}
