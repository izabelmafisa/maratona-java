package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia tr�s valores para os lados de um tri�ngulo (vari�veis A, B e C).
//Verificar se cada lado � menor que a soma dos outros dois lados.
//Se sim, saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero;
//Se n�o, verificar de A==B ou se A==C ou se B==C,
//sendo verdade o tri�ngulo � is�sceles; e caso contr�rio,
//o tri�ngulo ser� escaleno. Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia.
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
            System.out.println("o tri�ngulo � eq�il�tero");
        } else if (lado1==lado2||lado2==lado3||lado1==lado3) {
            System.out.println("o tri�ngulo � is�sceles");
        }
        else if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            System.out.println("o tri�ngulo ser� escaleno");
        }
        else {
            System.out.println("Os lados fornecidos n�o caracterizam um triangulo");
        }
    }
}

