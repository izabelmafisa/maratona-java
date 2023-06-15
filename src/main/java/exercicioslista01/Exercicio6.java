package exercicioslista01;

import java.util.Scanner;

//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//antecessor e seu sucessor
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int antecessor = numero -1;
        int sucessor = numero +1;
        System.out.println("O numero antecessor é: " + antecessor);
        System.out.println("O numero sucessor é: " + sucessor);
    }
}
