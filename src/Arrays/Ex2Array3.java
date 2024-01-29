package Arrays;

import java.util.Scanner;

public class Ex2Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
	 String codigoProduto[] = new String[10];
	 double precoProduto[] = new double[10];
	 String produtoMaiorPreco = "";
	 String produtoSegundoMaiorPreco = "";
	 String produtoTerceiroMaiorPreco = "";
	 double maiorPreco = Double.MIN_VALUE, segundoMaiorPreco = Double.MIN_VALUE, terceiroMaiorPreco = Double.MIN_VALUE;

	 	for (int i = 0; i < 10; i++) {
	 		System.out.println("Digite o código do produto: ");
	        codigoProduto[i] = sc.next();
	        System.out.println("Digite o preço do produto de código " + codigoProduto[i] + ": ");
	        precoProduto[i] = sc.nextDouble();

	        if (precoProduto[i] > maiorPreco) {
	        	terceiroMaiorPreco = segundoMaiorPreco;
	        	produtoTerceiroMaiorPreco = produtoSegundoMaiorPreco;
	        	segundoMaiorPreco = maiorPreco;
	        	produtoSegundoMaiorPreco = produtoMaiorPreco;
	        	maiorPreco = precoProduto[i];
	        	produtoMaiorPreco = codigoProduto[i];
	        } else if (precoProduto[i] > segundoMaiorPreco) {
	        	terceiroMaiorPreco = segundoMaiorPreco;
	        	produtoTerceiroMaiorPreco = produtoSegundoMaiorPreco;
	        	segundoMaiorPreco = precoProduto[i];
	        	produtoSegundoMaiorPreco = codigoProduto[i];
	        } else if (precoProduto[i] > terceiroMaiorPreco) {
	        	terceiroMaiorPreco = precoProduto[i];
	        	produtoTerceiroMaiorPreco = codigoProduto[i];
	        }
	 	}

	 	System.out.println("O produto com o 1° maior preço foi o produto de código " + produtoMaiorPreco + " custando R$ " + maiorPreco);
	 	System.out.println("O produto com o 2° maior preço foi o produto de código " + produtoSegundoMaiorPreco + " custando R$ " + segundoMaiorPreco);
	 	System.out.println("O produto com o 3° maior preço foi o produto de código " + produtoTerceiroMaiorPreco + " custando R$ " + terceiroMaiorPreco);
	 	sc.close();
	}
}

