package Arrays;

import java.util.Scanner;

public class Ex1Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double temperatura[] = new double[12];
		double maiorTemperatura = Double.MIN_VALUE, menorTemperatura = Double.MAX_VALUE;
		String mesMaiorTemperatura = "";
	    String mesMenorTemperatura = "";
	
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite a média de temperatura do mês " + meses[i] + ":");
			temperatura[i] = sc.nextDouble();
			if (maiorTemperatura < temperatura[i]) {
				maiorTemperatura = temperatura[i];
				mesMaiorTemperatura = meses[i];
				
			}
			if(menorTemperatura > temperatura[i]) {
				menorTemperatura = temperatura[i];
				mesMenorTemperatura = meses[i];
			}
		}
		
		System.out.println("O mês que obteve a maior temperatura foi em " + mesMaiorTemperatura + " com " + maiorTemperatura + "° ");
		System.out.println("O mês que obteve a menor temperatura foi em " + mesMenorTemperatura + "com " + menorTemperatura + "° ");
		sc.close();
	}
}
