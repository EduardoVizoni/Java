package Matrizes;

import java.util.Scanner;

public class Ex3Matriz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int numFuncionarios;
        String[] nomes;
        double salariosBrutos[];
        double inssDescontos[];
        double irrfDescontos[];
        double salariosLiquidos[];
        
   
        System.out.print("Digite o número de funcionários a serem registrados: ");
        numFuncionarios = sc.nextInt();
        sc.nextLine(); //Aprendi que isso limpa o buffer
        sc.close();
        if (numFuncionarios <= 0) {
            System.out.println("O número de funcionários deve ser superior a zero. O aplicativo será encerrado.");
            return; //Aprendi que isso pede um valor válido
            
        }
        
        nomes = new String[numFuncionarios];
        salariosBrutos = new double[numFuncionarios];
        inssDescontos = new double[numFuncionarios];
        irrfDescontos = new double[numFuncionarios];
        salariosLiquidos = new double[numFuncionarios];
        

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
            nomes[i] = sc.nextLine();
            
            while (nomes[i].length() < 2) {
                System.out.println("O nome deve conter pelo menos 2 caracteres.");
                System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
                nomes[i] = sc.nextLine();
            }
            
            System.out.print("Digite o salário bruto do " + nomes[i] + ": ");
            salariosBrutos[i] = sc.nextDouble();
            sc.nextLine();
            

            while (salariosBrutos[i] < 465.00) {
                System.out.println("O salário deve ser igual ou superior a R$ 465,00.");
                System.out.print("Digite o salário bruto do " + nomes[i] + ": ");
                salariosBrutos[i] = sc.nextDouble();
                sc.nextLine();
            }
            
            // Calcular INSS
            if (salariosBrutos[i] <= 965.67) {
                inssDescontos[i] = salariosBrutos[i] * 0.08;
            } else if (salariosBrutos[i] <= 1609.45) {
                inssDescontos[i] = salariosBrutos[i] * 0.09;
            } else {
                inssDescontos[i] = salariosBrutos[i] * 0.11;
            }
            
            // Calcular Imposto de Renda
            if (salariosBrutos[i] <= 1434.00) {
                irrfDescontos[i] = 0.0;
            } else if (salariosBrutos[i] <= 2150.00) {
                irrfDescontos[i] = salariosBrutos[i] * 0.075;
            } else if (salariosBrutos[i] <= 2886.00) {
                irrfDescontos[i] = salariosBrutos[i] * 0.15;
            } else if (salariosBrutos[i] <= 3582.00) {
                irrfDescontos[i] = salariosBrutos[i] * 0.225;
            } else {
                irrfDescontos[i] = salariosBrutos[i] * 0.275;
            }
            
            // Calcular Salário Líquido
            salariosLiquidos[i] = salariosBrutos[i] - inssDescontos[i] - irrfDescontos[i];
        }
        
        System.out.println("Relatório de Folha de Pagamento");
        System.out.println("------------------------------");
        
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Salário Bruto: R$ " + salariosBrutos[i]);
            System.out.println("Desconto INSS: R$ " + inssDescontos[i]);
            System.out.println("Desconto IRRF: R$ " + irrfDescontos[i]);
            System.out.println("Salário Líquido: R$ " + salariosLiquidos[i]);
            System.out.println("------------------------------");
        }
        
        double totalSalariosBrutos = 0;
        double totalDescontoINSS = 0;
        double totalDescontoIRRF = 0;
        double totalSalariosLiquidos = 0;
        
        for (int i = 0; i < numFuncionarios; i++) {
            totalSalariosBrutos += salariosBrutos[i];
            totalDescontoINSS += inssDescontos[i];
            totalDescontoIRRF += irrfDescontos[i];
            totalSalariosLiquidos += salariosLiquidos[i];
        }
        
        System.out.println("Total Salários Brutos: R$ " + totalSalariosBrutos);
        System.out.println("Total Desconto INSS: R$ " + totalDescontoINSS);
        System.out.println("Total Desconto IRRF: R$ " + totalDescontoIRRF);
        System.out.println("Total Salários Líquidos: R$ " + totalSalariosLiquidos);
        
        sc.close();
    }
}