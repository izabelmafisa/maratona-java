package exercicios03Lista;
//Ler quatro valores num�ricos inteiros e apresentar o resultado dois a dois da adi��o e multiplica��o entre os
//valores lidos, baseando-se na utiliza��o do conceito de propriedade distributiva. Dica: se forem lidas as vari�veis
//A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
//com D e por �ltimo C com D. Note que para cada opera��o ser�o utilizadas seis combina��es. Assim sendo,
//devem ser realizadas doze opera��es de processamento, sendo seis para as adi��es e seis para as
//multiplica��es.

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
        System.out.println("O resultado das somas s�o: ");
        resultado = primeiroNumero+segundoNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o segundo numero "+segundoNumero+" �: "+resultado);
        resultado = primeiroNumero+terceiroNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o terceiro numero "+terceiroNumero+" �: "+resultado);
        resultado = primeiroNumero+quartoNumero;
        System.out.println("A soma do primeiro numero "+primeiroNumero+" e o quarto numero "+quartoNumero+" �: "+resultado);

        System.out.println("-----------------------");

        resultado = segundoNumero + terceiroNumero;
        System.out.println("A soma do segundo numero "+segundoNumero+" e o terceiro numero "+terceiroNumero+" �: "+resultado);
        resultado = segundoNumero + quartoNumero;
        System.out.println("A soma do segundo numero "+segundoNumero+" e o quarto numero "+quartoNumero+" �: "+resultado);

        System.out.println("----------------------");

        resultado= terceiroNumero+quartoNumero;
        System.out.println("A soma do terceiro numero "+terceiroNumero+" e o quarto numero "+quartoNumero+" �: "+resultado);

    }
}
