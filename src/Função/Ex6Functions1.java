//Desenvolver uma estrutura modular com uma função que recebe através de parâmetro um número inteiro que
//corresponde a um mês do ano e retorna com o nome desse mês. Por exemplo, se o mês enviado for 1 a função
//deverá retorna janeiro, se o mês enviado for 2 a função deverá retornar fevereiro e assim por diante.

package Função;

import java.util.Scanner;

public class Ex6Functions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número de mês: ");
		int mes = sc.nextInt();
		mes = numero(mes);

		sc.close();
	}

	// O João Paulo me ensinou que eu poderia usar um vetor e colocar o nome de
	// todos os meses, isso encurtaria, porém deixarei da minha forma. Obrigado pelo
	// ensinamento.
	public static int numero(int mes) {
		switch (mes) {
		case 1:
			System.out.println("O " + mes + "° é janeiro");
			break;
		case 2:
			System.out.println("O " + mes + "° é Fevereiro");
			break;
		case 3:
			System.out.println("O " + mes + "° é Março");
			break;
		case 4:
			System.out.println("O " + mes + "° é Abril");
			break;
		case 5:
			System.out.println("O " + mes + "° é Maio");
			break;
		case 6:
			System.out.println("O " + mes + "° é Junho");
			break;
		case 7:
			System.out.println("O " + mes + "° é Julho");
			break;
		case 8:
			System.out.println("O " + mes + "° é Agosto");
			break;
		case 9:
			System.out.println("O " + mes + "° é Setembro");
			break;
		case 10:
			System.out.println("O " + mes + "° é Outubro");
			break;
		case 11:
			System.out.println("O " + mes + "° é Novembro");
			break;
		case 12:
			System.out.println("O " + mes + "° é Dezembro");
			break;
		}
		return mes;
	}
}
