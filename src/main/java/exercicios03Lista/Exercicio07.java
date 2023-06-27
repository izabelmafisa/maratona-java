package exercicios03Lista;
//Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
//temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
//variável C é a temperatura em graus Celsius.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double temperaturaCelsius = (temperaturaFahrenheit-32)*5/9;
        System.out.println("A conversão da temperatura para Celsius foi: "+temperaturaCelsius+" ºC");
    }
}
