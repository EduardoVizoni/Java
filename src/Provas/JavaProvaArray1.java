package Provas;

import java.util.Scanner;

public class JavaProvaArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int agenda;
		System.out.println("Insira a quantidade de vetores na sua agenda em seu banco de dados: ");
		agenda = sc.nextInt();

		char[] nome = new char[agenda];
		int[] telefone = new int[agenda];

		for (int i = 0; i < agenda; i++) {
			System.out.print("Digite o nome: ");
			nome[i] = sc.next().charAt(0);
			System.out.println("Digite o telefone:");
			telefone[i] = sc.nextInt();

		}

		System.out.println("Digite o nome que deseja consultar: ");
		char nomeConsulta = sc.next().charAt(0);

		boolean encontrado = false;
		for (int i = 0; i < agenda; i++) {
			if (nome[i] == nomeConsulta) {
				System.out.println("O telefone de " + nomeConsulta + " é: " + telefone[i]);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O nome " + nomeConsulta + " não foi encontrado em nossa agenda.");
		}
		sc.close();
	}
}
