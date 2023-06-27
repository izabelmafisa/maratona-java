package exerciciosEntradaProcessamentoSaida;
//Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
//temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
//Fahrenheit e a variável C representa é a temperatura em graus Celsius.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        System.out.println("A conversão da temperatura para Fahrenheit foi: "+temperaturaFahrenheit+" ºF");
    }
}
