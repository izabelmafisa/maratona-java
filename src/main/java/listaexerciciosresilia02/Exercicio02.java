package listaexerciciosresilia02;

import java.util.Scanner;
//Declare uma string de sua prefer�ncia e a imprima de maneira reversa.
// Realize o processo usando o m�todoreversedo Java.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String texto = scanner.nextLine();
        String reversotexto = new StringBuilder(texto).reverse().toString();
        System.out.println("texto modificado para: "+reversotexto);
    }
}
