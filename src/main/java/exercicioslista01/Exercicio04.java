package exercicioslista01;

import java.util.Scanner;

//Escrever um algoritmo que l�:
//- a porcentagem do IPI a ser acrescido no valor das pe�as
//- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1
//- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o acrescimo do ipi: ");
        double ipi= scanner.nextDouble();
        System.out.println("Insira o c�digo da primeira pe�a: ");
        int peca1 = scanner.nextInt();
        System.out.println("Digite a quantidade da primeira pe�a: ");
        int quant1= scanner.nextInt();
        System.out.println("Digite o valor da primeira pe�a 1: ");
        double valor= scanner.nextDouble();

        System.out.println("Insira o c�digo da segunda pe�a: ");
        int peca2 = scanner.nextInt();
        System.out.println("Digite a quantidade da segunda pe�a: ");
        int quant2= scanner.nextInt();
        System.out.println("Digite o valor da segunda pe�a: ");
        double valor2= scanner.nextDouble();

        double valortotal=(valor*quant1 + valor2*quant2)*(ipi/100 + 1);
        System.out.println("O total �: " + valortotal);
    }
}
