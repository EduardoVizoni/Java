package Arrays;

import java.util.Scanner;

public class Ex1Array2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

        int numAlunos = 10;
        double notas[] = new double[numAlunos];
        double soma = 0;
        double media = soma / numAlunos;
        int acimaDaMedia = 0;
        double maiorNota = notas[0];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }


        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.println("A média da turma é: " + media);
        System.out.println("Quantidade de alunos acima da média: " + acimaDaMedia);
        System.out.println("A maior nota foi: " + maiorNota);

        System.out.print("Posições da maior nota: ");
        for (int i = 0; i < numAlunos; i++) {
            if (notas[i] == maiorNota) {
                System.out.print((i + 1) + " ");
            }
        }
        sc.close();
    }
}