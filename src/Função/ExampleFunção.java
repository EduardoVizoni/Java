package Função;

public class ExampleFunção {
	public static void main(String[] args) {
		
		int a = 10 , b = 20, result;
		result = soma(a,b);
		
		System.out.println(result);
		
		
	}

	
	public static int soma (int c, int d) {
		int resultado = c+ d;
		return resultado;
	}
}