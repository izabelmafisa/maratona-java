package exercicioslista01;

import java.util.Scanner;

//Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
//calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
//(1SM=R$788,00)
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario_minimo = 788.00;
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        double salariototal= salario/salario_minimo;
        System.out.println("Ganha equivalente a : "+ salariototal + " salarios minimos");

    }
}
