package Exercícios;

import java.util.Scanner;

public class Ex7Java2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int canal = 0, canalQuatro = 0, canalCinco = 0, canalSete = 0, canalDoze = 0;
		int quantidadeDePessoas = 0, pessoasCanalQuatro = 0, pessoasCanalCinco = 0, pessoasCanalSete = 0, pessoasCanalDoze = 0, totalDePessoas = 0;
		
		do {
			System.out.println("Digite o número do seu canal favorito" +
					"\nCanal 4" +
					"\nCanal 5" +
					"\nCanal 7" +
					"\nCanal 12" +
					"\nDigite sua escolha: " );
			canal = sc.nextInt();
			if(canal > 0) {
			System.out.println("Digite quantas pessoas estão vendo TV nesta casa: ");
			quantidadeDePessoas = sc.nextInt();
			totalDePessoas += quantidadeDePessoas;
			}
			if ( canal == 4) {
				System.out.println(quantidadeDePessoas + " pessoa(s), preferem este canal ");
				canalQuatro++;
				pessoasCanalQuatro += quantidadeDePessoas;
			} else if(canal == 5) {
				System.out.println(quantidadeDePessoas + " pessoa(s), preferem este canal ");
				canalCinco++;
				pessoasCanalCinco += quantidadeDePessoas;
			} else if( canal == 7 ) {
				System.out.println(quantidadeDePessoas + " pessoa(s), preferem este canal ");
				canalSete++;
				pessoasCanalSete += quantidadeDePessoas;
			} else if( canal == 12 ) {
				System.out.println(quantidadeDePessoas + " pessoa(s), preferem este canal ");
				canalDoze++;
				pessoasCanalDoze += quantidadeDePessoas;
			} else {
				
			}
			
			
	} while ( canal > 0 );
	
	canalQuatro = (100 * pessoasCanalQuatro ) / quantidadeDePessoas;
	canalCinco = (100 * pessoasCanalCinco ) / quantidadeDePessoas;
	canalSete = (100 * pessoasCanalSete ) / quantidadeDePessoas;
	canalDoze = (100 * pessoasCanalDoze ) / quantidadeDePessoas;
	
	System.out.println(canalQuatro + "% estavam assistindo ao canal 4.");
	System.out.println(canalCinco + "% estavam assistindo ao canal 5.");
	System.out.println(canalSete + "% estavam assistindo ao canal 7.");
	System.out.println(canalDoze + "% estavam assistindo ao canal 12.");
	sc.close();
}
}
