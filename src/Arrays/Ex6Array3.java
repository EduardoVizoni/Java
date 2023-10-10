package Arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex6Array3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        Random gerador = new Random();
        
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = gerador.nextInt(1000) + 1;
            lista.add(numeroAleatorio);
        }
        
        System.out.println("Números gerados:");
        for (int numero : lista) {
            System.out.println(numero);
        }
        sc.close();
    }
}