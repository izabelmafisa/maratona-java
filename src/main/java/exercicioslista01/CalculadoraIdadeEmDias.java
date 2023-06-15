package exercicioslista01;
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class CalculadoraIdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

        System.out.println("A idade em dias é: " + idadeEmDias + " dias.");
    }

    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int totalDias = 0;

        totalDias += anos * 365;
        totalDias += meses * 30;
        totalDias += dias;

        return totalDias;
    }
}






