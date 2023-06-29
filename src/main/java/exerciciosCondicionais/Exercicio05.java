package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
//aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
//do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
//apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
//apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
//aluno.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insira sua primeira nota: ");
        double nota1= scanner.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        double nota2= scanner.nextDouble();
        System.out.println("Insira sua terceira nota: ");
        double nota3= scanner.nextDouble();
        System.out.println("Insira sua quarta nota: ");
        double nota4= scanner.nextDouble();
        double resultado=(nota1+nota2+nota3+nota4)/4.0;
        if (resultado<7){
            System.out.println("sua média foi: "+resultado+" ,você está na recuperação");
            System.out.println("Insira sua nota de recuperção: ");
            double notarec= scanner.nextDouble();
            double resultrec=(resultado+notarec)/2;
            if (resultrec<7){
                System.out.println("Infelizmente você reprovou");
            }else {
                System.out.println("Sua média foi: "+resultrec+" ,você foi aprovado");
            }
        }else {
                System.out.println("Sua média foi: "+resultado+" ,Parabéns você foi aprovado");
            }
        }
    }
