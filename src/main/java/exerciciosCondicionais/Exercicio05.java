package exerciciosCondicionais;

import java.util.Scanner;

//Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
//aprovado se o valor da m�dia escolar for maior ou igual a 7. Se o valor da m�dia for menor que 7, solicitar a nota
//do recupera��o, somar com o valor da m�dia e obter a nova m�dia. Se a nova m�dia for maior ou igual a 7,
//apresentar uma mensagem informando que o aluno foi aprovado na recupera��o. Se o aluno n�o foi aprovado,
//apresentar uma mensagem informando esta condi��o. Apresentar junto com as mensagens o valor da m�dia do
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
            System.out.println("sua m�dia foi: "+resultado+" ,voc� est� na recupera��o");
            System.out.println("Insira sua nota de recuper��o: ");
            double notarec= scanner.nextDouble();
            double resultrec=(resultado+notarec)/2;
            if (resultrec<7){
                System.out.println("Infelizmente voc� reprovou");
            }else {
                System.out.println("Sua m�dia foi: "+resultrec+" ,voc� foi aprovado");
            }
        }else {
                System.out.println("Sua m�dia foi: "+resultado+" ,Parab�ns voc� foi aprovado");
            }
        }
    }
