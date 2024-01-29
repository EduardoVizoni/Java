//Desenvolva uma estrutura modular com as funções que:
//Calcula e retorna o Índice de Massa Corpórea (IMC) através da seguinte fórmula:
//IMC = PC / (Alt * Alt); onde: PC - Peso Corporal em kg e Alt- altura em metros.
//Recebe através de parâmetro o índice de massa corpórea e retorna à interpretação conforme a tabela a seguir:
//IMC				Interpretação
//-------------------------------------------
//Menos de 20		Magro
//20 – 24			Normal
//25 – 29			Acima do peso
//30 – 34			Obeso
//Acima de 34		Muito Obeso
//-------------------------------------------

package Função;

import java.util.Scanner;

public class Ex10Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		System.out.print("Insira seu peso em KG: ");
		float peso = sc.nextFloat();
		System.out.print("Insira sua altura em metros: ");
		float altura = sc.nextFloat();
		
		@SuppressWarnings("unused")
		float resultado = IMC(peso, altura);
	}
	public static float IMC(float peso, float altura) {
		float resultado = 0;
		
		resultado = peso / (altura * altura);
		
		if(resultado < 20) {
			System.out.println("Interpretação dada como Magro.");
		}
		else if(resultado > 20 && resultado < 24) {
			System.out.println("Interpretação dada como Normal.");
		}
		else if(resultado > 25 && resultado < 39) {
			System.out.println("Interpretação dada como Acima do peso.");
		}
		else if(resultado > 30 && resultado < 34) {
			System.out.println("Interpretação dada como Obeso.");
		}
		else if(resultado > 34) {
			System.out.println("Interpretação dada como Muito obeso.");
		}
		
		return resultado;
	}
}
