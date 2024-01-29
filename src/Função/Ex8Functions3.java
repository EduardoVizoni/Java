//O número 3025 possui a seguinte característica:
//30 + 25 = 55
//55 * 55 = 3025
//Desenvolva uma estrutura modular que verifica, através de uma função, e imprima todos os números de quatro algarismos (de 1000 até 9999) que apresentam tal característica.

package Função;

import java.util.Scanner;

public class Ex8Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Números de 4 algarismo entre 1000 e 9999:");
        for (int i = 1000; i <= 9999; i++) {
            if (algarismos(i)) {
                System.out.println(i);
            }
        }
    }
	 public static boolean algarismos(int n) {
	      int calc1, calc2, soma, num;

	      calc1 = n / 100;
	      calc2 = n % 100;

	      soma = calc1 + calc2;

	      num = soma * soma;

	      if (n == num)
	         return(true);
	      else return(false);
	    }

	}

