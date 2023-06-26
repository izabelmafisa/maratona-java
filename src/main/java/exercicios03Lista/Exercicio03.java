package exercicios03Lista;
// Faça um programa para pagamento de comissão de vendedores de peças,
// levando-se em consideração que sua
//comissão será de 5% do total da venda e que você tem os seguintes dados:
//- Identificação do vendedor
//- Código da peça
//- Preço unitário da peça
//- Quantidade vendida

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insira sua identificação: ");
        int idVendendor= scanner.nextInt();
        System.out.println("Insira o código da peça: ");
        int idPeca= scanner.nextInt();
        System.out.println("Insira o valor da peça: ");
        double valorPeca= scanner.nextDouble();
        System.out.println("Insira quantas peças foram vendidas: ");
        int quantidadePecas= scanner.nextInt();
        double totalVendas = valorPeca*quantidadePecas;
        double comissao= totalVendas*0.5;
        System.out.println("O total de vendas foi: "+totalVendas);
        System.out.println("Sua comissão com as vendas das peças é: " +comissao);
    }
}
