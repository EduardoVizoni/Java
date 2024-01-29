package Procedure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex2Procedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        int daquiA;
        System.out.println("Digite a seguir a data em formato númerico");
        System.out.print("Qual é o dia de hoje?: ");
        dia = sc.nextInt();
        System.out.print("Qual o mês de hoje?: ");
        mes = sc.nextInt();
        System.out.print("Qual é o ano?: ");
        ano = sc.nextInt();
        System.out.println("Digite quantos dias deseja avançar: ");
        daquiA = sc.nextInt();

        
        soma(dia, mes, ano, daquiA);

        sc.close();
    }

    public static void soma(int dia, int mes, int ano, int daquiA) {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate dataNova = dataAtual.plusDays(daquiA);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", new Locale("pt", "BR"));
        String dataFormatada = dataNova.format(formatador);

        System.out.println("Daqui a " + daquiA + " dias será " + dataFormatada);
    }
}