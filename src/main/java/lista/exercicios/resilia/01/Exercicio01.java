package lista.de.exercicio.resilia;
//Escreva um programa em Java onde o usu�rio digite a nota da prova 1 e depois a nota da prova 2.
// Calcule a m�dia (nota1 + nota2 / 2)
// e, se a m�dia for maior ou igual a 7 imprima na tela a mensagem "Parab�ns, voc� foi aprovado",
// se n�o imprima na tela "Infelizmente voc� foi reprovado".


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
            System.out.println("Parab�ns, voc� foi aprovado");
        }
        else {
            System.out.println("Infelizmente voc� foi reprovado");
        }
    }
}
