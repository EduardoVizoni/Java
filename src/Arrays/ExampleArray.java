package Arrays;
import java.util.Scanner;

public class ExampleArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperatura[] = new double [10];
	
		for ( int cont = 0; cont < 10 ; cont++ ) {
			System.out.println("Digite a temperatura: ");
			
			temperatura[cont] = sc.nextDouble();
		}
		for (int cont2 = 0; cont2 < 10; cont2++ ) {
			System.out.println("As temperaturas são: " + temperatura[cont2]);
		}
		sc.close();
	}

}
