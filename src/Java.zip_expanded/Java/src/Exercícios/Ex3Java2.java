package Exercícios;

import java.util.Scanner;

public class Ex3Java2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double joao = 1.50, ze = 1.10;
		int ano = 0;
		
		do {
			joao = joao + 0.02;
			ze = ze + 0.03;
			System.out.println(" Zé tem: " + ze + "\nJoão tem: " + joao + "\n");
			ano++;
			System.out.println("Ao final do ano \n" + ano );
		}while ( joao > ze);
		System.out.println("Zé será maior que joão após " + ano + "\nanos");
		sc.close();
	}
	}
