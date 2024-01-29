package Arrays;

import java.util.Scanner;

public class Ex4Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = sc.nextInt();

        int vetor1[] = new int[tamanho];
        int vetor2[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
        	System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
        	vetor1[i] = sc.nextInt();
        }

     
        for (int i = 0; i < tamanho; i++) {
        	System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
        	vetor2[i] = sc.nextInt();
        }

        boolean conteudoIgual = true;

        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] != vetor2[i]) {
                conteudoIgual = false;
                break;
            }
        }

        if (conteudoIgual) {
            System.out.println("Os vetores têm o mesmo conteúdo.");
        } else {
            System.out.println("Os vetores têm conteúdo diferente.");
        }
        sc.close();
    }
}