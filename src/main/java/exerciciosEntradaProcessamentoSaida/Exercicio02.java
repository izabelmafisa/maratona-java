package exerciciosEntradaProcessamentoSaida;

import java.util.Scanner;

//Fa�a um programa que:
//- Leia a cota��o do d�lar
//- Leia um valor em d�lares
//- Converta esse valor para Real
//- Mostre o resultad
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cota��o de dolar: ");
        double cotacaoDolar= scanner.nextDouble();
        System.out.println("Digite o saldo de dolares: ");
        double saldoDolares= scanner.nextDouble();
        double saldoReal = cotacaoDolar*saldoDolares;
        System.out.println("O saldo convertido para o real �: "+ saldoReal);
    }
}