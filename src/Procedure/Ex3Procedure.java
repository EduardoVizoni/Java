package Procedure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex3Procedure {
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

        DateTimeFormatter formatadorPTBR = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", new Locale("pt", "BR"));
        String dataFormatadaPTBR = dataNova.format(formatadorPTBR);
        DateTimeFormatter formatadorEN = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", new Locale("en", "EN"));
        String dataFormatadaEN = dataNova.format(formatadorEN);
        DateTimeFormatter formatadorFR = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", new Locale("fr", "FR"));
        String dataFormatadaFR = dataNova.format(formatadorFR);
        DateTimeFormatter formatadorES = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", new Locale("es", "ES"));
        String dataFormatadaES = dataNova.format(formatadorES);

        System.out.println("Daqui a " + daquiA + " dias será " + dataFormatadaPTBR);
        System.out.println("Daqui a " + daquiA + " dias será " + dataFormatadaEN);
        System.out.println("Daqui a " + daquiA + " dias será " + dataFormatadaFR);
        System.out.println("Daqui a " + daquiA + " dias será " + dataFormatadaES);
    }
}