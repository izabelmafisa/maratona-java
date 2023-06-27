package exerciciosEntradaProcessamentoSaida;
//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//V = 3.14159 * R * R * A
//Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        double volume = 3.14159*raio*raio*altura;
        System.out.println("O volume da lata de óleo é: "+volume);
    }
}
