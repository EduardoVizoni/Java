package Arrays;

import java.util.Scanner;

public class Ex1Array1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char nome[] = new char[10];
		double vendas[] = new double[10];
		double percentualDasVendas[] = new double[10];
		double comissao[] = new double[10];
		double maiorComissao1 = 0, menorComissao1 = 999999, totalDeVendas = 0;
		char maiorComissao2 = 0;
		char menorComissao2 = 0;
		
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Digite o nome do vendedor: ");
			nome[cont] = sc.next().charAt(0);
			
			System.out.println("Qual foi o seu percentual de venda?: ");
			percentualDasVendas[cont] = sc.nextDouble();
			
			System.out.println("Qual foi seu total de vendas?: ");
			vendas[cont] = sc.nextDouble();
			
			comissao[cont] = ( vendas[cont] / 100 ) * percentualDasVendas[cont];
			
			if (maiorComissao1 < comissao[cont]) {
				maiorComissao1 = comissao[cont];
				maiorComissao2 = nome[cont];
		} if (menorComissao1 > comissao[cont]) {
			menorComissao1 = comissao[cont];
			menorComissao2 = nome[cont];
		}
		totalDeVendas += vendas[cont];

}
		for ( int cont2 = 0; cont2 < 10; cont2++) {
			System.out.println("O vendendor " + nome[cont2] + " fez R$ " + vendas[cont2] + " em vendas e recebeu R$ " + comissao[cont2] + " como valor de comissão ");
		}
		System.out.println("O valor total das vendas foi de R$ " + totalDeVendas);
		System.out.println( maiorComissao2 +" conseguiu a maior comissão, sua comissão foi de R$ " + maiorComissao1);
		System.out.println( menorComissao2 +" conseguiu a menor comissão, sua comissão foi de R$ " + menorComissao1);
		sc.close();
	}
}
