package listaexerciciosresilia02;

import java.util.Scanner;

//Escreva um programa Java que receba a entrada de um número inteiro
// e imprima o ÍMPAR ou PAR do número inserido
public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero= scanner.nextInt();
        if (numero %2 ==0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
