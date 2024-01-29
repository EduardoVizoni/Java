package Exercícios;

import java.util.Scanner;

public class Ex2Java2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto = 0, naoPerecivel = 0, perecivel = 0, vestuario = 0, higienePessoal = 0, limpezaEtc = 0;
		
		do {
			System.out.println("Digite o código do produto: ");
			codigoProduto = sc.nextInt();
			if (codigoProduto == 1) {
				System.out.println("Este é um produto não-perecível");
				naoPerecivel++;
			}
			else if (codigoProduto >= 2 && codigoProduto <= 4) {
				System.out.println("Este é um produto perecível");
				perecivel++;
			}
			else if (codigoProduto >=5 && codigoProduto <= 6 ) {
				System.out.println("Este é um produto de vestuário");
				vestuario++;
			}
			else if (codigoProduto == 7) {
				System.out.println("Este é um produto de higiene pessoal");
				higienePessoal++;
			}
			else if (codigoProduto >= 8 && codigoProduto <=15) {
				System.out.println("Este é um produto de limpeza e utensílios domésticos");
				limpezaEtc++;
			}
			
		} while (codigoProduto != 0 );
		System.out.println("A quantidade de produtos não-perecíveis é de: " + naoPerecivel);
		System.out.println("A quantidade de produtos perecíveis é de: " + perecivel);
		System.out.println("A quantidade de produtos de vestuário: " + vestuario);
		System.out.println("A quantidade de produtos de higiene pessoal: " + higienePessoal);
		System.out.println("A quantidade de protudos de limpeza e utensílios domésticos: " + limpezaEtc);
		sc.close();
}
}
