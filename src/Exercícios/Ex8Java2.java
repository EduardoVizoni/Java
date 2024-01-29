package Exercícios;

import java.util.Scanner;

public class Ex8Java2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pagamento = 0;
		double precoDoCarro = 0.0;
		
		System.out.println("Digite o preço do veículo: ");
		precoDoCarro = sc.nextFloat();
		System.out.println("Para a forma de pagamento digite o solicitado: " +
							"\nÀ vista		1" +
				            "\n6 parcelas	2" +
							"\n12 parcelas	3" +
				            "\n18 parcelas	4" +
							"\n24 parcelas	5" +
				            "\n30 parcelas 	6" +
							"\n36 parcelas 	7" +
				            "\n42 parcelas	8" +
							"\n48 parcelas	9" +
				            "\n54 parcelas	10" +
							"\n60 parcelas	11" +
				            "\n Selecione sua opção: " );
		pagamento = sc.nextInt();
		
		switch (pagamento) {
		case 1:
			pagamento = 1;
			precoDoCarro = precoDoCarro * 0.8;
			System.out.println("Você pagará à vista, logo terá 20% de desconto, o valor será de: R$" + precoDoCarro + "0");
			break;
		case 2:
			pagamento = 2;
			precoDoCarro = precoDoCarro * 1.03;
			System.out.println("Você pagará em 6 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 3:
			pagamento = 3;
			precoDoCarro = precoDoCarro * 1.06;
			System.out.println("Você pagará em 12 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 4:
			pagamento = 4;
			precoDoCarro = precoDoCarro * 1.09;
			System.out.println("Você pagará em 18 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 5:
			pagamento = 5;
			precoDoCarro = precoDoCarro * 1.12;
			System.out.println("Você pagará em 24 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 6:
			pagamento = 6;
			precoDoCarro = precoDoCarro * 1.15;
			System.out.println("Você pagará em 30 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 7:
			pagamento = 7;
			precoDoCarro = precoDoCarro * 1.18;
			System.out.println("Você pagará em 36 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 8:
			pagamento = 8;
			precoDoCarro = precoDoCarro * 1.21;
			System.out.println("Você pagará em 42 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 9:
			pagamento = 9;
			precoDoCarro = precoDoCarro * 1.24;
			System.out.println("Você pagará em 48 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 10:
			pagamento = 10;
			precoDoCarro = precoDoCarro * 1.27;
			System.out.println("Você pagará em 54 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		case 11:
			pagamento = 11;
			precoDoCarro = precoDoCarro * 1.30;
			System.out.println("Você pagará em 60 parcelas, o preço será de: R$"+ precoDoCarro + "0");
			break;
		default:
			System.out.println("Método de pagamento inválido, por favor, selecione um método de pagamento ");
			sc.close();
	
			
		}
	}
}
