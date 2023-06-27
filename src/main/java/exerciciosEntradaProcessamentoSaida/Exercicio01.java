package exerciciosEntradaProcessamentoSaida;
//Faça um programa para calcular o estoque médio de uma peça, sendo que:
//ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade minima de estoque: ");
        int quantidadeMinima= scanner.nextInt();
        System.out.println("Digite a quantidade maxima de estoque: ");
        int quantidadeMaxima= scanner.nextInt();
        int estoqueMedio = (quantidadeMinima + quantidadeMaxima)/2;
        System.out.println("O estoque medio é: "+ estoqueMedio);
    }
}
