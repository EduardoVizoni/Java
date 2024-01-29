package Arrays;

import java.util.Scanner;

public class Ex3Array1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	double temperatura[] = new double[121];
	double maiorTemperatura = 0.0, menorTemperatura = 999999, mediaTemperatura = 0.0, totalDasTemperaturas = 0.0;
	int maiorTemperaturaDoDia = 0, menorTemperaturaDoDia = 0;
	
	for ( int cont = 1; cont <= 3 ; cont++ ) {
		System.out.println("Digite as temperaturas de janeiro de 1976 até abril de 1976: ");
		temperatura[cont] = sc.nextInt();
	if (temperatura[cont] <= 40 && temperatura[cont] >= 15) {
		
		if ( maiorTemperatura < temperatura[cont]) {
			maiorTemperatura = temperatura[cont];
			maiorTemperaturaDoDia = cont;
			
		} if ( menorTemperatura > temperatura[cont]) {
			menorTemperatura = temperatura[cont];
			menorTemperaturaDoDia = cont;
		}
		
	} else {
		System.out.println("Temperatura inválida, tente novamente ");
		cont--;
		
	}
	}
	
	
	for ( int cont2 = 1; cont2  <= 3 ; cont2++) {
		totalDasTemperaturas += temperatura[cont2];
	}
	
	mediaTemperatura = (totalDasTemperaturas / 3 );
	
	System.out.println("A menor temperatura do dia foi de " + menorTemperatura + "°C, no dia " + menorTemperaturaDoDia );
	System.out.println("A maior temperatura do dia foi de " + maiorTemperatura + "°C. no dia " + maiorTemperaturaDoDia );
	System.out.println("A temperatura média dos 121 dias foi de " + mediaTemperatura);	
	sc.close();
	} 
	
	
}

