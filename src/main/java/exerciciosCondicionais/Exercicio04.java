package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia dois n�meros e apresente a diferen�a do maior para o menor.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira um numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira outro numero: ");
        double num2 = scanner.nextDouble();
        double resultado;
        if (num1>num2){
            resultado=num1-num2;
            System.out.println("A diferen�a entre o maior e o menor numero �: "+resultado);
        }else {
            resultado=num2-num1;
            System.out.println("A diferen�a entre o maior e o menor numero �: "+resultado);
        }

    }
}
