//A avaliação de aproveitamento de uma certa disciplina é feita através de 4 provas mensais no valor de 20 pontos e
//uma prova final no valor de 40 pontos. A nota final é obtida somando-se as 3 melhores notas, dentre as provas mensais, com a nota da prova final.
//O conceito final é dado atendendo-se ao seguinte critério:
//De 90 a 100 - Conceito A
//De 80 a  89 - Conceito B
//De 10 a  19 - Conceito C
//De 60 a  69 - Conceito D
//De 40 a  59 - Conceito E
//De  O a  39 - Conceito F
//Fazer uma sub-rotina que, recebendo como parâmetro 4 (quatro) números inteiros, devolva ao módulo que a chamou a soma dos 3 (três) maiores números dentre os 4 (quatro) números recebidos.
//Fazer um algoritmo que:
//Leia um conjunto de 80 linhas contendo, cada uma, o número do aluno, as 4 notas mensais e a nota da prova final;
//Calcule, para cada aluno, sua nota final, utilizando a sub-rotina anterior;
//Verifique o conceito obtido;
//Escreva, para cada aluno, o seu número, a sua nota final e o seu conceito.

package Função;

import java.util.Scanner;

public class Ex14Functions3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i = 1; i <= 80; i++) {
			System.out.println("Aluno " + i + ":");
			System.out.print("Digite as 4 notas mensais e a nota da prova final (separadas por espaço): ");
			int nota1 = sc.nextInt();
			int nota2 = sc.nextInt();
			int nota3 = sc.nextInt();
			int nota4 = sc.nextInt();
			int notaFinal = sc.nextInt();

			int notaFinalCalculada = calcularNotaFinal(nota1, nota2, nota3, nota4, notaFinal);
			char conceito = calcularConceito(notaFinalCalculada);

			System.out.println("Número do aluno: " + i);
			System.out.println("Nota final: " + notaFinalCalculada);
			System.out.println("Conceito: " + conceito);
			System.out.println();
		}

	}

	public static int calcularNotaFinal(int nota1, int nota2, int nota3, int nota4, int notaFinal) {
		int notasMensais[] = { nota1, nota2, nota3, nota4 };
		int somaTresMaiores = somaTresMaiores(notasMensais);

		return somaTresMaiores + notaFinal;
	}

	public static int somaTresMaiores(int[] notas) {
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			int max = 0;
			int index = 0;

			for (int j = 0; j < notas.length; j++) {
				if (notas[j] > max) {
					max = notas[j];
					index = j;
				}
			}

			soma += max;
			notas[index] = 0;
		}

		return soma;
	}

	public static char calcularConceito(int notaFinal) {
		if (notaFinal >= 90 && notaFinal <= 100) {
			return 'A';
		} else if (notaFinal >= 80 && notaFinal <= 89) {
			return 'B';
		} else if (notaFinal >= 70 && notaFinal <= 79) {
			return 'C';
		} else if (notaFinal >= 60 && notaFinal <= 69) {
			return 'D';
		} else if (notaFinal >= 40 && notaFinal <= 59) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
