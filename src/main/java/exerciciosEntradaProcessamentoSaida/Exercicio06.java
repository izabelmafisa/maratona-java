package exerciciosEntradaProcessamentoSaida;
//Ler uma temperatura em graus Celsius e apresent�-Ia convertida em graus Fahrenheit. A f�rmula de convers�o de
//temperatura a ser utilizada � F = (9 * C + 160) / 5, em que a vari�vel F representa � a temperatura em graus
//Fahrenheit e a vari�vel C representa � a temperatura em graus Celsius.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        System.out.println("A convers�o da temperatura para Fahrenheit foi: "+temperaturaFahrenheit+" �F");
    }
}
