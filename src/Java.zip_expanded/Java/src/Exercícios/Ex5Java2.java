package Exercícios;

import java.util.Scanner;

public class Ex5Java2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Double paisA = 90.0, paisB = 140.0;
		int ano = 0;
		
		do {
			paisA = paisA + 0.035;
			paisB = paisB + 0.01;
			System.out.println (" O país B tem: "+ paisB + "\n" + "país A tem: " + paisA + "\n");
			ano++;
			System.out.println("Ao final do ano " + ano + "\n\n");
		} while ( paisB > paisA );
		
		System.out.println("Pais A será maior que o país B após "+ ano + "anos\n");
		sc.close();
		}
		
	}
