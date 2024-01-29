//• Sortear um número de 0 a 1000 (dica: usar random)
//• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//menor do que o número sorteado.
//• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//quantas tentativas ele acertou.

package Função;

import java.util.Random;
import java.util.Scanner;

public class Ex1Functions2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Random geradorAleatorio = new Random();
		int numeroAleatorio = geradorAleatorio.nextInt(1001);
		boolean resultado = false;
		int tentativas = 0;
	
		System.out.print("Bem-vindo ao jogo do Acerte um Número, aqui temos uma possibilidade entre 0 a 1000\n");
		
		while (resultado == false) {
			resultado = tentativas(resultado, numeroAleatorio);
			tentativas++;
			
		}
		System.out.print("O número de tentativas foi de: " + tentativas);
		
	}
		public static boolean tentativas(boolean resultado, int numeroAleatorio) {
			
			boolean result = false;
			int palpite = 0;
			System.out.print("De seu palpite: ");
			palpite = sc.nextInt();
			
			if (palpite == numeroAleatorio) {
				System.out.println("Parabéns, você acertou, o número sorteado era: " + numeroAleatorio);
				result = true;
			} else if (palpite > numeroAleatorio) {
				System.out.println("Uma dica, este número é maior do que o sorteado ");
			} else if (palpite < numeroAleatorio) {
				System.out.println("Uma dica, este número é menor do que o sorteado ");
			}
				
			
			
			return result;
		}
}
