package Matrizes;

import java.util.Scanner;

public class Ex1Matriz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeOficial;

		System.out.print("Digite o nome do oficial responsável: ");
		nomeOficial = sc.nextLine();

		int pessoasParaInterrogar = 0;

		System.out.print("Oficial " + nomeOficial + ", quantas pessoas serão interrogadas?: ");
		pessoasParaInterrogar = sc.nextInt();

		String nome[] = new String[pessoasParaInterrogar];
		String resposta1[] = new String[pessoasParaInterrogar];
		String resposta2[] = new String[pessoasParaInterrogar];
		String resposta3[] = new String[pessoasParaInterrogar];
		String resposta4[] = new String[pessoasParaInterrogar];
		String resposta5[] = new String[pessoasParaInterrogar];

		int totalRespostas[] = new int[pessoasParaInterrogar];
		int suspeito = 0;

		for (int i = 0; i < pessoasParaInterrogar; i++) {
			System.out.print("Olá " + (i + 1) + "° interrogado, qual seu nome?: ");
			nome[i] = sc.next();
			System.out.print("Você telefonou para a vítima em algum momento?: ");
			resposta1[i] = sc.next();

			if (resposta1[i].equals("Sim") || resposta1[i].equals("sim") || resposta1[i].equals("S") || resposta1[i].equals("s")) {
				suspeito++;
			}
			if (resposta1[i].equals("Não") || resposta1[i].equals("Nao") || resposta1[i].equals("não") || resposta1[i].equals("nao") || resposta1[i].equals("N") || resposta1[i].equals("n")) {

			}
			System.out.print("Você esteve no local do crime?: ");
			resposta2[i] = sc.next();

			if (resposta2[i].equals("Sim") || resposta2[i].equals("sim") || resposta2[i].equals("S") || resposta2[i].equals("s")) {
				suspeito++;
			}
			if (resposta2[i].equals("Não") || resposta2[i].equals("Nao") || resposta2[i].equals("não") || resposta2[i].equals("nao") || resposta2[i].equals("N") || resposta2[i].equals("n")) {

			}
			System.out.print("Você mora perto da vítima?: ");
			resposta3[i] = sc.next();

			if (resposta3[i].equals("Sim") || resposta3[i].equals("sim") || resposta3[i].equals("S") || resposta3[i].equals("s")) {
				suspeito++;
			}
			if (resposta3[i].equals("Não") || resposta3[i].equals("Nao") || resposta3[i].equals("não") || resposta3[i].equals("nao") || resposta3[i].equals("N") || resposta3[i].equals("n")) {

			}
			System.out.print("Você devia algo para a vítima?: ");
			resposta4[i] = sc.next();

			if (resposta4[i].equals("Sim") || resposta4[i].equals("sim") || resposta4[i].equals("S") || resposta4[i].equals("s")) {
				suspeito++;
			}
			if (resposta4[i].equals("Não") || resposta4[i].equals("Nao") || resposta4[i].equals("não") || resposta4[i].equals("nao") || resposta4[i].equals("N") || resposta4[i].equals("n")) {

			}
			System.out.print("Você já trabalhou com a vítima?: ");
			resposta5[i] = sc.next();

			if (resposta5[i].equals("Sim") || resposta5[i].equals("sim") || resposta5[i].equals("S") || resposta5[i].equals("s")) {
				suspeito++;
			}
			if (resposta5[i].equals("Não") || resposta5[i].equals("Nao") || resposta5[i].equals("não") || resposta5[i].equals("nao") || resposta5[i].equals("N") || resposta5[i].equals("n")) {

			}
			totalRespostas[i] = suspeito;
		}
	
		for (int i = 0; i < pessoasParaInterrogar; i++) {
			if (totalRespostas[i] == 5) {
				System.out.print("Você é considerado o assassino, o oficial " + nomeOficial + " irá te encarcerar");
			} else if (totalRespostas[i] >= 3) {
				System.out.println("Você é considerado cúmplice, o oficial " + nomeOficial + " irá te encarcerar");
			} else if (totalRespostas[i] == 2) {
				System.out.println("Você é considerado suspeito, o oficial " + nomeOficial + " irá te vigiar, fique de olho!");
			}
		}
		sc.close();
	}
}