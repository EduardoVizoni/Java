//Desenvolver uma estrutura modular com uma função que calcula e retorna o peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7 * Alt) - 58;
//Para mulheres: (62.1 * Alt) - 44.7.
//Obs. No corpo do programa principal deve-se obter os dados de entrada: sexo e altura (em metros).

package Função;

import java.util.Scanner;

public class Ex10Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int resultado = 0;
		System.out.println("Digite o número correspondente do seu sexo:" + "\nFeminino	1" + "\nMasculino	2");
		double sexo = sc.nextInt();
		System.out.println("Insira sua altura em metros: ");
		double altura = sc.nextInt();

		resultado = ideal(sexo, altura);
		sc.close();
	}

	public static int ideal(double sexo, double altura) {
		int resultado = 0;
		if (sexo == 1) {
			System.out.println("Você é do genêro feminino");
			System.out.println("Peso ideal (Feminino) = " + ((62.1 * altura) - 44.7));
		} else if (sexo == 2) {
			System.out.println("Você é do genêro masculino");
			System.out.println("Peso ideal (Masculino) = " + ((72.7 * altura) - 58));
		}
		return resultado;
	}
}
