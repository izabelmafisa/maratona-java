package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia um n�mero inteiro.
//Verificar por meio de condi��o se o valor fornecido est� na faixa
//entre 0 (zero) e 9 (nove).
// Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem �valor v�lido�.
//Caso contr�rio, apresentar a mensagem �valor inv�lido�.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int num1= scanner.nextInt();
        if (num1 >=0||num1<=9){
            System.out.println("O numero inserido � valido");
        }else{
            System.out.println("O numero inserido � invalido");
        }
    }
}
