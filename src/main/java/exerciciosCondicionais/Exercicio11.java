package exerciciosCondicionais;

import java.util.Scanner;

//Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
//positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do{
        System.out.println("Insira um numero inteiro: ");
        num= scanner.nextInt();
        if (num<0){
            System.out.println("O numero inserido é negativo");
         } else if (num>0) {
            System.out.println("O numero inserido é positivo");
         }
        }while (num!=0);


    }
}
