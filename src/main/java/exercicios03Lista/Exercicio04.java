package exercicios03Lista;
//Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
//valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
//A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
//com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
//devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
//multiplicações.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int primeiroNumero= scanner.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int segundoNumero= scanner.nextInt();
        System.out.println("Digite o terceiro numero inteiro: ");
        int terceiroNumero= scanner.nextInt();
        System.out.println("Digite o quarto numero inteiro: ");
        int quartoNumero= scanner.nextInt();
        int resultado;
        System.out.println("O resultado das somas são: ");
        resultado = primeiroNumero+segundoNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o segundo numero "+segundoNumero+" é: "+resultado);
        resultado = primeiroNumero+terceiroNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o terceiro numero "+terceiroNumero+" é: "+resultado);
        resultado = primeiroNumero+quartoNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o quarto numero "+quartoNumero+" é: "+resultado);

        System.out.println("-----------------------");

        resultado = segundoNumero + terceiroNumero;
        System.out.println("A soma do segundo numero "+segundoNumero+" e o terceiro numero "+terceiroNumero+" é: "+resultado);
        resultado = segundoNumero + quartoNumero;
        System.out.println("A soma do segundo numero "+segundoNumero+" e o quarto numero "+quartoNumero+" é: "+resultado);

        System.out.println("----------------------");

        resultado= terceiroNumero+quartoNumero;
        System.out.println("A soma do terceiro numero "+terceiroNumero+" e o quarto numero "+quartoNumero+" é: "+resultado);

    }
}
