package exerciciosEntradaProcessamentoSaida;
// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
//pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe sua idade expressa em anos: ");
        int idadeAnos= scanner.nextInt();
        System.out.println("Informe sua idade expressa em meses: ");
        int idadeMeses= scanner.nextInt();
        System.out.println("Informe sua idade expressa em dias: ");
        int idadeDias= scanner.nextInt();
        int idadeEmDias= (idadeAnos*365)+(idadeMeses*30)+idadeDias;
        System.out.println("Sua idade em dias é: "+idadeEmDias+" Dias");

    }
}
