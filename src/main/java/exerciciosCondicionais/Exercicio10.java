package exerciciosCondicionais;

import java.util.Scanner;

//Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
//Ler um valor maior que zero para cada variável (se o valor digitado não é válido,
//mostrar mensagem e ler novamente).
//Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int num1=scanner.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2=scanner.nextInt();
        System.out.println("Digite o terceiro numero inteiro: ");
        int num3=scanner.nextInt();
      while(num1>=0 && num2>=0 && num3 >=0)
      {
            int menor=Math.min(Math.min(num1,num2),num3);
            int maior=Math.max(Math.max(num1,num2),num3);
            int produto = menor * maior;
            int divisao = maior / menor;
            System.out.println("O menor valor multiplicado pelo maior: " + produto);
            System.out.println("O maior valor dividido pelo menor: " + divisao);
            break;
        }
    }
}

