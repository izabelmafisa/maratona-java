package exerciciosCondicionais;

import java.util.Scanner;

//Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
//Ler um valor maior que zero para cada variável (se o valor digitado não é válido,
//mostrar mensagem e ler novamente).
//Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        do {
            System.out.println("Insira o primeiro valor: ");
            num1= scanner.nextInt();
        } while (num1<0);
        do {
            System.out.println("Insira o segundo valor: ");
            num2= scanner.nextInt();
        }while (num2<0);
        do {
            System.out.println("Insira o terceiro valor: ");
            num3= scanner.nextInt();
        }while (num3<0);
        int menor=Math.min(Math.min(num1,num2),num3);
        int maior=Math.max(Math.max(num1,num2),num3);

        int produto=menor*maior;
        System.out.println("O menor valor multiplicado pelo maior é: "+produto);
        int divisao=maior/menor;
        System.out.println("A divisão do maior valor pelo menor valor é: "+divisao);
    }
}

