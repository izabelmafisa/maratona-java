package exerciciosCondicionais;

import java.util.Scanner;

//Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
//resultado.
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2;
        do {
            System.out.println("Insira o primeiro numero: ");
            num1= scanner.nextInt();
        }while (num1<0);
        do {
            System.out.println("Insira0o segundo valor:  ");
            num2= scanner.nextInt();
        }while (num2>0);
        System.out.println("Os valores dos numeros informados são: "+num1+", "+num2);
    }
}
