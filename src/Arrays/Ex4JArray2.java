package Arrays;

import java.util.Scanner;

public class Ex4JArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
        int n, k;
        double pesos[];
        double notas[][];

        System.out.print("Digite o número de alunos (n): ");
        n = sc.nextInt();
        System.out.print("Digite o número de provas (k): ");
        k = sc.nextInt();

        pesos = new double[k];
        System.out.println("Digite os pesos das provas:");
        for (int i = 0; i < k; i++) {
            pesos[i] = sc.nextDouble();
        }
        
        notas = new double[n][k];
        System.out.println("Digite as notas dos alunos:");
        for (int i = 0; i < n; i++) {
            System.out.println("Aluno " + (i+1) + ":");
            for (int j = 0; j < k; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double mediaPonderada = 0;
            for (int j = 0; j < k; j++) {
                mediaPonderada += notas[i][j] * pesos[j];
            }
            mediaPonderada /= k;
            System.out.println("Média ponderada do Aluno " + (i+1) + ": " + mediaPonderada);
        }

        for (int j = 0; j < k; j++) {
            double mediaProva = 0;
            for (int i = 0; i < n; i++) {
                mediaProva += notas[i][j];
            }
            mediaProva /= n;
            System.out.println("Média da prova " + (j+1) + ": " + mediaProva);
        }
        sc.close();
    }
}