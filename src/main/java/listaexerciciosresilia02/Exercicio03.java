package listaexerciciosresilia02;
//Escreva um programa Java que leia um inteiro
// entre 0 e 1000
// e some todos os dígitos desse inteiro.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 1000:");
        int numero= scanner.nextInt();
        int soma= somatorio(numero);
        System.out.println("Resultado: "+ soma);
        scanner.close();
    }

    public static int somatorio(int numero) {
        int soma = 0;
        String numeroString= String.valueOf(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            char digitoChar= numeroString.charAt(i);
            int digito= Integer.parseInt(String.valueOf(digitoChar));
            soma+=digito;
        }
        return soma;
    }
}
