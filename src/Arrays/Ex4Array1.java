package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4Array1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		ArrayList<String> nomes = new ArrayList<String>();
		
		 
		int escolha;
		
	do {
		System.out.println("|———————— MENU ————————| \r"
				+ "1) Cadastrar nome \r"
				+ "2) Pesquisar nome \r"
				+ "3) Listar todos os nome \r"
				+ "0) Sair do programa \r"
				+ "|——————————————————————| \r"
				+ "Digite sua escolha:\r"
				+ "");
		escolha = sc.nextInt();
	switch (escolha) {
	case 1:
             System.out.print("Digite o nome a ser cadastrado: ");
             String novoNome = sc.next();
             nomes.add(novoNome);
             System.out.println("Nome cadastrado com sucesso.");
             break;
    case 2:
             System.out.print("Digite o nome a ser pesquisado: ");
             String nomePesquisado = sc.next();
             if (nomes.contains(nomePesquisado)) {
                 System.out.println("O nome foi encontrado.");
             } else {
                 System.out.println("O nome não foi encontrado.");
             }
             break;
    case 3:
             if (nomes.isEmpty()) {
                 System.out.println("Não há nomes cadastrados.");
             } else {
                 System.out.println("Nomes cadastrados:");
                 for (String nome : nomes) {
                     System.out.println(nome);
                 }
             }
             break;
    case 0:
             System.out.println("Você desejou sair do programa, programa fechando, aguarde...");
             sc.close();
             return;
         default:
             System.out.println("Escolha inválida. Tente novamente.");
	}

		
		
		} while (escolha != 0);
	sc.close();
	}
}