package exerciciosEntradaProcessamentoSaida;

import java.util.Scanner;

//Escrever um programa que leia dois n�meros inteiros e mostre todos os relacionamentos de ordem existentes
//entre eles. Os relacionamentos poss�veis s�o: Igual, N�o igual, Maior, Menor, Maior ou igual, Menor ou igual.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1= scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2= scanner.nextInt();
        if (num1 ==num2){
            System.out.println("Os numeros s�o iguais");
        } else {
            System.out.println("Os numeros s�o desiguais");
        }
        if (num1 > num2) {
            System.out.println("O primeiro numero � maior que o segundo numero");
        }else{
            System.out.println("O primeiro numero n�o � maior que o segundo numero");
        }
        if (num1>=num2){
            System.out.println("O primeiro numero � igual o maior que o segundo numero");
        }else {
            System.out.println("O primeiro numero � menor que o segundo numero");
        }
    }
}
