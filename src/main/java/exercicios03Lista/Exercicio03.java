package exercicios03Lista;
// Fa�a um programa para pagamento de comiss�o de vendedores de pe�as,
// levando-se em considera��o que sua
//comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados:
//- Identifica��o do vendedor
//- C�digo da pe�a
//- Pre�o unit�rio da pe�a
//- Quantidade vendida

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insira sua identifica��o: ");
        int idVendendor= scanner.nextInt();
        System.out.println("Insira o c�digo da pe�a: ");
        int idPeca= scanner.nextInt();
        System.out.println("Insira o valor da pe�a: ");
        double valorPeca= scanner.nextDouble();
        System.out.println("Insira quantas pe�as foram vendidas: ");
        int quantidadePecas= scanner.nextInt();
        double totalVendas = valorPeca*quantidadePecas;
        double comissao= totalVendas*0.5;
        System.out.println("O total de vendas foi: "+totalVendas);
        System.out.println("Sua comiss�o com as vendas das pe�as �: " +comissao);
    }
}
