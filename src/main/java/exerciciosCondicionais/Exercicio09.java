package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C).
//Verificar se cada lado é menor que a soma dos outros dois lados.
//Se sim, saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero;
//Se não, verificar de A==B ou se A==C ou se B==C,
//sendo verdade o triângulo é isósceles; e caso contrário,
//o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do triangulo: ");
        double lado1= scanner.nextDouble();
        System.out.println("Digite o valor do segundo lado do triangulo: ");
        double lado2= scanner.nextDouble();
        System.out.println("Digite o valor do terceiro lado do triangulo: ");
        double lado3= scanner.nextDouble();
        if (lado1==lado2 &&lado2==lado3){
            System.out.println("o triângulo é eqüilátero");
        } else if (lado1==lado2||lado2==lado3||lado1==lado3) {
            System.out.println("o triângulo é isósceles");
        }
        else if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            System.out.println("o triângulo será escaleno");
        }
        else {
            System.out.println("Os lados fornecidos não caracterizam um triangulo");
        }
    }
}

