package exercicios03Lista;
//Ler uma temperatura em graus Fahrenheit e apresent�-Ia convertida em graus Celsius. A f�rmula de convers�o de
//temperatura a ser utilizada � C = (F - 32) * 5 / 9, em que a vari�vel F � a temperatura em graus Fahrenheit e a
//vari�vel C � a temperatura em graus Celsius.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double temperaturaCelsius = (temperaturaFahrenheit-32)*5/9;
        System.out.println("A convers�o da temperatura para Celsius foi: "+temperaturaCelsius+" �C");
    }
}
