package lista.de.exercicio.resilia;
//Escreva um programa em Java que solicite ao usuário um número inteiro positivo
// e exiba a tabuada desse número de 1 a 10 utilizando um loop while

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int numero= scanner.nextInt();
        if (numero<0){
            System.out.println("Numero invalido");
        }
        else {
        int contador = 1;

        while (contador<=10){
            int total=numero*contador;
            System.out.println(numero+" x" + contador+" ="+total);
            contador++;
        }
    }}
}
