//Número perfeito é aquele cuja soma de seus divisores, exceto ele próprio, é igual ao número. Exemplo: 6 é perfeito
//porque 1 + 2 + 3 = 6. Desenvolva uma estrutura modular que imprima os números perfeitos compreendidos entre 1 e 500.

package Função;

import java.util.Scanner;

public class Ex6Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int n;

		System.out.printf("Numeros perfeitos compreendidos entre 1 e 500:\n");
		for (n = 1; n <= 500; n++) {
			if (perfeito(n) == true)
				System.out.printf("%d\n", n);
		}

	}

	public static boolean perfeito(int n) {
		int i, somaDivisores = 0;
		for (i = 1; i <= (n / 2); i++) {
			if ((n % i) == 0)
				somaDivisores = somaDivisores + i;
		}

		if (n == somaDivisores)
			return (true);
		else
			return (false);
	}
}
