package exerciciosEntradaProcessamentoSaida;
//Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
//ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade minima de estoque: ");
        int quantidadeMinima= scanner.nextInt();
        System.out.println("Digite a quantidade maxima de estoque: ");
        int quantidadeMaxima= scanner.nextInt();
        int estoqueMedio = (quantidadeMinima + quantidadeMaxima)/2;
        System.out.println("O estoque medio �: "+ estoqueMedio);
    }
}
