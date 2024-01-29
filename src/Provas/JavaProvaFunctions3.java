package Provas;

import java.util.Scanner;

public class JavaProvaFunctions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Insira um número inteiro no qual deseja elevá-lo por outro: ");
		int num = sc.nextInt();

		System.out.print("Agora, digite o número pelo qual deseja elevá-lo: ");
		int potencia = sc.nextInt();

		int resultado = calcularPotencia(num, potencia);

		System.out.println(num + " elevado a " + potencia + " é igual a " + resultado);

	}

	public static int calcularPotencia(int num, int potencia) {
		if (potencia < 0) {
			System.out.println("O expoente deve ser um número não-negativo para este exemplo.");
			num = -1;
		} 
		
		int resultado = 1;

		for (int i = 0; i < potencia; i++) {
			resultado *= num;
		}

		return resultado;
	}
}