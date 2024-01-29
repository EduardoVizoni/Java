package Arrays;

import java.util.Scanner;

public class Ex5Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String vendedor[] = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"};
		int pecaPorVendedor[] = new int[10];
		int tipoVendido[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite quantas peças o vendedor " + vendedor[i] + " vendeu:" );
			pecaPorVendedor[i] = sc.nextInt();
		
		boolean tipoRepetido = false;
		do {
			System.out.println("Digite qual o tipo de peça o vendedor " + vendedor[i] + " vende por código, exemplo (1, 2, 3...):");
			tipoVendido[i] = sc.nextInt();
			
			for (int i2 = 0; i2 < i; i2++) {
				if (tipoVendido[i2] == tipoVendido[i]) {
					tipoRepetido = true;
					System.out.println("Esse tipo de peça já foi vendido por outro vendedor. Digite outro tipo.");
					break;
				}
			}
		} while (tipoRepetido);
		
     }

     int totalQuantidades = 0;
     for (int quantidade : pecaPorVendedor) {
         totalQuantidades += quantidade;
     }

     for (int i = 0; i < 10; i++) {
         double valorTotal = pecaPorVendedor[i] * 10;
         System.out.println("O vendedor " + (i + 1) + " vendeu " + pecaPorVendedor[i] + " peças do tipo " + pecaPorVendedor[i] + ", totalizando R$" + valorTotal);
     }


     System.out.println("A quantidade total de peças vendidas por todos os vendedores é: " + totalQuantidades);
     sc.close();
	}
		
}
