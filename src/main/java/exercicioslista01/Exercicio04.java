package exercicioslista01;

import java.util.Scanner;

//Escrever um algoritmo que lê:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o acrescimo do ipi: ");
        double ipi= scanner.nextDouble();
        System.out.println("Insira o código da primeira peça: ");
        int peca1 = scanner.nextInt();
        System.out.println("Digite a quantidade da primeira peça: ");
        int quant1= scanner.nextInt();
        System.out.println("Digite o valor da primeira peça 1: ");
        double valor= scanner.nextDouble();

        System.out.println("Insira o código da segunda peça: ");
        int peca2 = scanner.nextInt();
        System.out.println("Digite a quantidade da segunda peça: ");
        int quant2= scanner.nextInt();
        System.out.println("Digite o valor da segunda peça: ");
        double valor2= scanner.nextDouble();

        double valortotal=(valor*quant1 + valor2*quant2)*(ipi/100 + 1);
        System.out.println("O total é: " + valortotal);
    }
}
