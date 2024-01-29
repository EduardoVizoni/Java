//Desenvolver uma estrutura modular com uma função que calcula e retorna o Gasto Energético Basal (GEB), utilizando as seguintes fórmulas:
//Para os homens: GEB = 66.47 + (13.75 * PC) + (5 * Alt) – (6.76 * I);
//Para as mulheres: GEB = 655.1 + (9.56 * PC) + (1.85 * Alt) – (4.67 * I);
//Onde: PC- Peso Corporal em “kg”; Alt- altura em “cm” e I- Idade. Obs. No corpo do programa principal deve-se obter 
//os dados de entrada: sexo, peso corporal, altura e idade e a função deverá receber estes dados através de parâmetros retornando o gasto energético basal calculado.

package Função;

import java.util.Scanner;

public class Ex9Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int geb = 0;
		System.out.println("Digite o número correspondente do seu sexo:" + "\nFeminino	1" + "\nMasculino	2");
		double sexo = sc.nextInt();
		System.out.print("Insira o seu peso corporal em KG: ");
		double pesoCorporal = sc.nextInt();
		System.out.print("Insira sua altura em cm: ");
		double altura = sc.nextInt();
		System.out.print("Insira sua idade: ");
		double idade = sc.nextInt();

		geb = geb( sexo, pesoCorporal, altura, idade);

		sc.close();
	}
	public static int geb(double sexo, double pesoCorporal, double altura, double idade) {

		int result = 0;

		if (sexo == 1) {
			System.out.println("Você é do genêro feminino");
			System.out.println("GEB(Feminino) = " + (655.1 + (9.56 * pesoCorporal) + (1.85 * altura) - (4.67 * idade)));
		} else if(sexo == 2) {
			System.out.println("Você é do genêro masculino");
			System.out.println("GEB(Masculino) = " + (66.47 + (13.75 * pesoCorporal) + (5 * altura) - (6.76 * idade)));
		}
		return result;
	}
}
