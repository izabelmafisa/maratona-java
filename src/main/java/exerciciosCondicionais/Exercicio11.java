package exerciciosCondicionais;

import java.util.Scanner;

//Fa�a um programa que leia um n�mero inteiro e mostre uma mensagem na tela indicando se este n�mero �
//positivo ou negativo. Pare a execu��o do programa quando o usu�rio requisitar.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do{
        System.out.println("Insira um numero inteiro: ");
        num= scanner.nextInt();
        if (num<0){
            System.out.println("O numero inserido � negativo");
         } else if (num>0) {
            System.out.println("O numero inserido � positivo");
         }
        }while (num!=0);


    }
}
