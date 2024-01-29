//Desenvolva uma estrutura modular com uma função que recebe dois números inteiros, positivos, e determine o produto dos mesmos, utilizando o seguinte método de multiplicação:
//Dividir sucessivamente o primeiro número por 2 até que se obtenha 0 como quociente;
//Paralelamente, dobrar, sucessivamente, o segundo número;
//Somar os números da segunda coluna que tenham como correspondente na primeira coluna um número ímpar. O total obtido é o produto procurado.
//Exemplo: 9 x 6
//9, ímpar				 6	----> 6
//(9 / 2) = 4, par		12
//(4 / 2) = 2, par		24
//(2 / 2) = 1, ímpar		48	----> 48, 6 + 48 = 54
//A seguir escrever um programa que pergunte ao usuário 10 pares de números e calcule os respectivos produtos, usando a função acima.

package Função;

import java.util.Scanner;

public class Ex9Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, i;

		for (i = 1; i <= 10; i++) {
			num1 = (int) Math.round(Math.random() * 20);
			num2 = (int) Math.round(Math.random() * 20);

			System.out.printf("%2d X %2d = %3d\n", num1, num2, produto(num1, num2));
		}
	}

	public static int produto(int num1, int num2) {
		int somaMulti = 0;
		while (num1 != 0) {
			if ((num1 % 2) == 1)
				somaMulti = somaMulti + num2;

			num1 = num1 / 2;
			num2 = num2 * 2;
		}

		return somaMulti;
	}

}
