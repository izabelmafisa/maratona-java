package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia um n�mero inteiro e exiba o seu m�dulo.
//O m�dulo de um n�mero x �:
//x se x � maior ou igual a zero
//x * (-1) se x � menor que zero
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero= scanner.nextInt();
        int modulo=(numero>=0 ? numero:numero*(-1));
            System.out.println("O modulo do numero �: "+modulo);

    }
}
