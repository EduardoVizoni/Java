//Moda
package Provas;

import java.util.Scanner;

public class JavaProvaFunctions1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

        System.out.print("Digite a quantidade de números que deseja: ");
        int tamanho = sc.nextInt();

        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetor[i] = sc.nextInt();
        }

        int moda = moda(vetor);

        System.out.println("O número que mais se repete no vetor é: " + moda);

    }

    public static int moda(int vetor[]) {
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        int moda = vetor[0];
        int contagemAtual = 1;
        int maxContagem = 1;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1]) {
                contagemAtual++;
            } else {
                contagemAtual = 1;
            }

            if (contagemAtual > maxContagem) {
                maxContagem = contagemAtual;
                moda = vetor[i];
            }
        }

        return moda;
    }
}