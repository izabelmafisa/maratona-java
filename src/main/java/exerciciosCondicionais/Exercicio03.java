package exerciciosCondicionais;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que leia 3 n�meros inteiros
// e imprima na tela os valores em ordem decrescente.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] numeros= new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o numero inteiro: "+(i+1)+" �N");
            numeros[i]= scanner.nextInt();
        }
        Arrays.sort(numeros);
        int[] numerosDecrescente=new int[3];
        for (int i = 0; i < 3; i++) {
            numerosDecrescente[i]=numeros[2-i];
        }
        System.out.println("N�meros em ordem decrescente:");
        for (int numero : numerosDecrescente) {
            System.out.println(numero);
        }
    }
}
