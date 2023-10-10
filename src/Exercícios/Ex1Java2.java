package Exercícios;

import java.util.Scanner;

public class Ex1Java2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int estado, cidade, maiorNumAcidentes = 0, menorNumAcidentes = 0, totalDeCarrosSC = 0, totalDeCarrosRS = 0, totalDeCarrosPR = 0, mediaDeAcidentesSC = 0, mediaDeAcidentesRS = 0, mediaDeAcidentesPR = 0, totalDeAcidentesSC = 0, totalDeAcidentesRS = 0, totalDeAcidentesPR = 0;
		int veiculosDePasseio111 = 0, veiculosDePasseio112= 0, veiculosDePasseio113= 0, veiculosDePasseio114= 0;
		int veiculosDePasseio221= 0, veiculosDePasseio222= 0, veiculosDePasseio223= 0, veiculosDePasseio224= 0;
		int veiculosDePasseio331= 0, veiculosDePasseio332= 0, veiculosDePasseio333= 0, veiculosDePasseio334= 0;
		int vitimas111= 0, vitimas112= 0, vitimas113= 0, vitimas114= 0, vitimas221= 0, vitimas222= 0, vitimas223= 0, vitimas224= 0, vitimas331= 0, vitimas332= 0, vitimas333= 0, vitimas334= 0;
		String maiorNumAcidentesString = null;
		String menorNumAcidentesString = null;
		
	for ( int cont = 0; cont < 2; cont++) {
		System.out.println("Digite: " +
							"\n1	SC"+
							"\n2	RS"+
							"\n3	PR"+
							"\nEscolha um estado: ");
		estado = sc.nextInt();
		
		//Estado de Santa Catarina
		if (estado == 1) {
			System.out.println("Digite o código da sua cidade: " +
								"\n11	Jaraguá do Sul"+
								"\n12	Joinville"+
								"\n13	Blumenau"+
								"\n14	Florianópolis");
			cidade = sc.nextInt();
			if ( cidade == 11 ) {
				System.out.println("Digite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio111 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas111 = sc.nextInt();
			} if ( cidade == 12 ) {
				System.out.println("Digite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio112 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas112 = sc.nextInt();
			} if (cidade == 13 ) {
				System.out.println("Digite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio113 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas113 = sc.nextInt();
			} if ( cidade == 14 ) {
				System.out.println("Digite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio114 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas114 = sc.nextInt();
			}
			
			
		//Estado do Rio Grande do Sul
		} if (estado == 2) {
			System.out.println("Digite o código da sua cidade: " +
								"\n21	Porto alegre"+
								"\n22	Bento Gonçalves"+
								"\n23	Garibaldi"+
								"\n24	Caxias do Sul");
			cidade = sc.nextInt();
			if ( cidade == 21 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio221 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas221 = sc.nextInt();
			} if ( cidade == 22 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio222 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas222 = sc.nextInt();
			} if ( cidade == 23 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio223 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas223 = sc.nextInt();
			} if ( cidade == 24 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio224 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas224 = sc.nextInt();
			}
			
			
		//Estado do Paraná
		} if (estado == 3) {
			System.out.println("Digite o código da sua cidade: " +
								"\n31	Curitiba"+
								"\n32	Foz do iguaçu"+
								"\n33	Toledo"+
								"\n34	Cascavel");
			cidade = sc.nextInt();
			if ( cidade == 31 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio331 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas331 = sc.nextInt();
			} if ( cidade == 32 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio332 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas332 = sc.nextInt();
			} if ( cidade == 33 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio333 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas333 = sc.nextInt();
			} if ( cidade == 34 ) {
				System.out.println("DIgite o número de veículos de passeio que essa cidade possui: ");
				veiculosDePasseio334 = sc.nextInt();
				System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
				vitimas334 = sc.nextInt();
			}
		 
		if(maiorNumAcidentes < vitimas111) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Jaraguá do Sul/SC";
		} else if(maiorNumAcidentes < vitimas112) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Joinville/SC";
		} else if(maiorNumAcidentes < vitimas113) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Blumenau/SC";
		} else if(maiorNumAcidentes < vitimas114) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Florianópolis/SC";
		} else if(maiorNumAcidentes < vitimas221) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Porto Alegre/RS";
		} else if(maiorNumAcidentes < vitimas222) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Bento Gonçalves/RS";
		} else if(maiorNumAcidentes < vitimas223) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Garibaldi/RS";
		} else if(maiorNumAcidentes < vitimas224) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Caxias do Sul/RS";
		} else if(maiorNumAcidentes < vitimas331) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Curitiba/PR";
		} else if(maiorNumAcidentes < vitimas332) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Foz do Iguaçu/Pr";
		} else if(maiorNumAcidentes < vitimas333) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Toledo/PR";
		} else if(maiorNumAcidentes < vitimas334) {
			maiorNumAcidentes = vitimas111;
			maiorNumAcidentesString = "Cascavel/PR";
		}
		if(menorNumAcidentes > vitimas111) {
			menorNumAcidentes = vitimas111;
			menorNumAcidentesString = "Jaraguá do Sul/SC";
		} else if(menorNumAcidentes > vitimas112) {
			menorNumAcidentes = vitimas112;
			menorNumAcidentesString = "Joinville/SC";
		} else if(menorNumAcidentes > vitimas113) {
				menorNumAcidentes = vitimas113;
				menorNumAcidentesString = "Blumenau/SC";
		} else if(menorNumAcidentes > vitimas114) {
				menorNumAcidentes = vitimas114;
				menorNumAcidentesString = "Florianópolis/SC";
		} else if(menorNumAcidentes > vitimas221) {
				menorNumAcidentes = vitimas221;
				menorNumAcidentesString = "Porto Alegre/RS";
		} else if(menorNumAcidentes > vitimas222) {
				menorNumAcidentes = vitimas222;
				menorNumAcidentesString = "Bento Gonçalves/RS";
		} else if(menorNumAcidentes > vitimas223) {
				menorNumAcidentes = vitimas223;
				menorNumAcidentesString = "Garibaldi/RS";
		} else if(menorNumAcidentes > vitimas224) {
				menorNumAcidentes = vitimas224;
				menorNumAcidentesString = "Caxias do Sul/RS";
		} else if(menorNumAcidentes > vitimas331) {
				menorNumAcidentes = vitimas331;
				menorNumAcidentesString = "Curitiba/PR";
		} else if(menorNumAcidentes > vitimas332) {
				menorNumAcidentes = vitimas332;
				menorNumAcidentesString = "Foz do Iguaçu/PR";
		} else if(menorNumAcidentes > vitimas333) {
				menorNumAcidentes = vitimas333;
				menorNumAcidentesString = "Toledo/PR";
		} else if(menorNumAcidentes > vitimas334) {
				menorNumAcidentes = vitimas334;
				menorNumAcidentesString = "Cascavel/PR";
		}
		}
		}
	totalDeCarrosSC = (veiculosDePasseio111 + veiculosDePasseio112 + veiculosDePasseio113 + veiculosDePasseio114 ) / 4;
	totalDeCarrosRS = (veiculosDePasseio221 + veiculosDePasseio222 + veiculosDePasseio223 + veiculosDePasseio224 ) / 4;
	totalDeCarrosPR = (veiculosDePasseio331 + veiculosDePasseio332 + veiculosDePasseio333 + veiculosDePasseio334 ) / 4;
	
	mediaDeAcidentesSC = (vitimas111 + vitimas112 + vitimas113 + vitimas114 ) / 4;
	mediaDeAcidentesRS = (vitimas221 + vitimas222 + vitimas223 + vitimas224 ) / 4;
	mediaDeAcidentesPR = (vitimas331 + vitimas332 + vitimas333 + vitimas334 ) / 4;
	
	totalDeAcidentesSC = (vitimas111 + vitimas112 + vitimas113 + vitimas114 ) ;
	totalDeAcidentesRS = (vitimas221 + vitimas222 + vitimas223 + vitimas224 ) ;
	totalDeAcidentesPR = (vitimas331 + vitimas332 + vitimas333 + vitimas334 ) ;
	
	System.out.println("A cidade que mais teve acidentes foi: " + maiorNumAcidentesString);
	System.out.println("A cidade que menos teve acidentes foi: " + menorNumAcidentesString);
	System.out.println("A média de carros no estado de Santa Catarina é de: " + totalDeCarrosSC);
	System.out.println("A média de carros no estado do Rio Grande do Sul é de: " + totalDeCarrosRS);
	System.out.println("A méida de carros no estado do Paraná é de: " + totalDeCarrosPR);
	System.out.println("A média de acidentes no estado de Santa Catarina é de: " + mediaDeAcidentesSC);
	System.out.println("A média de acidentes no estado do Rio Grande do Sul é de: " + mediaDeAcidentesRS);
	System.out.println("A média de acidentes no estado do Paraná é de: " + mediaDeAcidentesPR);
	System.out.println("O total de acidentes no estado de Santa Catarina é de: " + totalDeAcidentesSC);
	System.out.println("O total de acidentes no estado do Rio Grande do Sul é de: " + totalDeAcidentesRS);
	System.out.println("O total de acidentes no estado do Paraná é de: " + totalDeAcidentesPR);
	sc.close();
 			}
}
