package lista.de.exercicio.resilia;
//Escreva um programa em Java que contenha um array de números inteiros
// e imprima a quantidade de números pares e ímpares
// utilizando um loop for.
public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = {3, 9, 6, 7, 20, 45, 90, 55, 64, 97, 28};
        int qPares = 0;
        int qImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                qPares++;
            } else {
                qImpares++;
            }
        }
        System.out.println("Numeros pares: " + qPares);
        System.out.println("Numeros impares:" + qImpares);
    }
}
