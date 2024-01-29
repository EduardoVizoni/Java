package Procedure;

import java.util.Scanner;

public class Ex1Procedure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		double valorReal = 0;
		byte moeda;
		
		
		
		System.out.println("Digite para qual moeda deseja converter seu valor: " +
							"\n1	Dólar" +
							"\n2	Yene" );
		moeda = sc.nextByte();
		
		System.out.println("Quantos reais você deseja converter");
		valorReal = sc.nextDouble();
			
		if (moeda == 1) {
			valorDolar(valorReal);
	}
		if ( moeda ==2) {
			valorYene(valorReal);
		}
		sc.close();
	}
	
	public static void valorDolar(double valorReal) {
		double converter = valorReal * 0.30;
		System.out.println(converter);
	}
	
	public static void valorYene(double valorReal) {
		double converter = valorReal * 30;
		System.out.println(converter);
		
	}
}
