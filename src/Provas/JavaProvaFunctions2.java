package Provas;

import java.util.Scanner;

public class JavaProvaFunctions2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int notas[] = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite a " + (i + 1) + "ª nota (0 a 100): ");
			notas[i] = sc.nextInt();
		}

		System.out.print("Digite a letra (A para média aritmética, P para média ponderada): ");
		char letra = sc.next().charAt(0);

		double media = calcularMedia(notas, letra);
		System.out.println("A média do aluno é: " + media);

		sc.close();
	}

	public static double calcularMedia(int notas[], char letra) {
		if (letra == 'A' || letra == 'a') {
			return (notas[0] + notas[1] + notas[2]) / 3.0;
		} 
		else if (letra == 'P' || letra == 'p') {
			return (notas[0] * 5 + notas[1] * 3 + notas[2] * 2) / 10.0;
		} 
		else {
			System.out.println("Letra inválida. Use 'A' para média aritmética ou 'P' para média ponderada.");
			return -1.0;
		}
	}
}