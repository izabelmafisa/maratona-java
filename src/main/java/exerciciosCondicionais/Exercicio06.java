package exerciciosCondicionais;

import java.util.Scanner;

// Escreva um programa que leia dois n�meros e exiba mensagem informando o valor do maior n�mero e o valor do
//menor n�mero. Se os dois n�meros forem iguais, o programa deve exibir mensagem informando este fato.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira o primeiro  numero: ");
        int num1= scanner.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("O numero maior �: "+num1);
            System.out.println("O numero menor �: "+num2);
        }if (num2>num1){
            System.out.println("O numero maior �: "+num2);
            System.out.println("O numero menor �: "+num1);
        }else {
            System.out.println("Os numeros inseridos s�o iguais: "+num1+","+num2);
        }
    }
}
