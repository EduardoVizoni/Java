package Exercícios;

import java.util.Scanner;

public class Ex9Java2 {
	
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        String nomesClientes[] = new String[150];
		        double comprasClientes[] = new double[150];

		        for (int cont = 0; cont < 150; cont++) {
		            System.out.print("Nome do cliente " + (cont+1) + ": ");
		            nomesClientes[cont] = sc.nextLine();

		            System.out.print("Compras do cliente " + (cont+1) + " no ano passado: ");
		            comprasClientes[cont] = Double.parseDouble(sc.nextLine());
		        }

		        System.out.println("\nResultados:");

		        for (int cont = 0; cont < 150; cont++) {
		            double bonus = comprasClientes[cont] < 500000 ? comprasClientes[cont] * 0.10 : comprasClientes[cont] * 0.15;
		            System.out.println("O cliente " + nomesClientes[cont] + " receberá um bônus de R$" + bonus);
		        }

		        sc.close();
		    }
		}
