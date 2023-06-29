package exerciciosCondicionais;

import java.util.Scanner;

//Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
//possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1= scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2= scanner.nextInt();
        int num3= num1;
        num1=num2;
        num2=num3;
        System.out.println("A substituição do primeiro numero é: "+ num1);
        System.out.println("A substituição do segundo  numero é: "+ num2);

    }
}
