package Provas;

import java.util.Scanner;

public class JavaProvaFunctions4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		  int inst_hora1, inst_min1, inst_seg1;
		  int inst_hora2, inst_min2, inst_seg2;
		  
	        do {
	            System.out.print("Insira alguma hora (0 a 23): ");
	            inst_hora1 = sc.nextInt();
	        } while (inst_hora1 < 0 || inst_hora1 > 23);

	        do {
	            System.out.print("Insira algum minuto (0 a 59): ");
	            inst_min1 = sc.nextInt();
	        } while (inst_min1 < 0 || inst_min1 > 59);

	        do {
	            System.out.print("Insira algum segundo (0 a 59): ");
	            inst_seg1 = sc.nextInt();
	        } while (inst_seg1 < 0 || inst_seg1 > 59);

	        System.out.println("Priemira hora inserida: " + inst_hora1 + ":" + inst_min1 + ":" + inst_seg1);

	        do {
	            System.out.print("Insira alguma hora (0 a 23): ");
	            inst_hora2 = sc.nextInt();
	        } while (inst_hora2 < 0 || inst_hora2 > 23);

	        do {
	            System.out.print("Insira algum minuto (0 a 59): ");
	            inst_min2 = sc.nextInt();
	        } while (inst_min2 < 0 || inst_min2 > 59);

	        do {
	            System.out.print("Insira algum segundo (0 a 59): ");
	            inst_seg2 = sc.nextInt();
	        } while (inst_seg2 < 0 || inst_seg2 > 59);

	        System.out.println("Segunda hora inserida: " + inst_hora2 + ":" + inst_min2 + ":" + inst_seg2);
	        
	        int resultado1 = converterParaSegundos(inst_hora1, inst_min1, inst_seg1);
	        int resultado2 = converterParaSegundos(inst_hora2, inst_min2, inst_seg2);

	        System.out.println("Resultado da 1° hora: " + resultado1 + " segundos");
	        System.out.println("Resultado da 2° hora: " + resultado2 + " segundos");
	    }
	   public static int lerHora() {
	        int hora;
	        do {
	     
	            hora = sc.nextInt();
	        } while (hora < 0 || hora > 23);
	        return hora;
	    }

	    public static int lerMinuto() {
	        int minuto;
	        do {
	            minuto = sc.nextInt();
	        } while (minuto < 0 || minuto > 59);
	        return minuto;
	    }

	    public static int lerSegundo() {
	        int segundo;
	        do {

	            segundo = sc.nextInt();
	        } while (segundo < 0 || segundo > 59);
	        return segundo;
	    }

	    public static int converterParaSegundos(int hora, int minuto, int segundo) {
	        return hora * 3600 + minuto * 60 + segundo;
	    }
	}