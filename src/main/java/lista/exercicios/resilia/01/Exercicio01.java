package lista.de.exercicio.resilia;
//Escreva um programa em Java onde o usuário digite a nota da prova 1 e depois a nota da prova 2.
// Calcule a média (nota1 + nota2 / 2)
// e, se a média for maior ou igual a 7 imprima na tela a mensagem "Parabéns, você foi aprovado",
// se não imprima na tela "Infelizmente você foi reprovado".


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        double nota1= scanner.nextDouble();
        System.out.println("Digite a nota da segunda prova ");
        double nota2 = scanner.nextDouble();
        double media = (nota1+nota2/2);
        if (media >=7){
            System.out.println("Parabéns, você foi aprovado");
        }
        else {
            System.out.println("Infelizmente você foi reprovado");
        }
    }
}
