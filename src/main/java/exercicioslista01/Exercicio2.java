package exercicioslista01;
//Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
//n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
public class Exercicio2 {
    public static void main(String[] args) {

         double media1 = (8 + 9 + 7) / 3.0;
         double media2 = (4 + 5 + 6) / 3.0;
         double somaMedia = media1 + media2;
         double mediaGeral = somaMedia / 2;

        System.out.println("M�dia dos n�meros 8, 9 e 7: " + media1);
        System.out.println("M�dia dos n�meros 4, 5 e 6: " + media2);
        System.out.println("Soma das M�dias " + somaMedia);
        System.out.println("M�dia geral " + mediaGeral);
    }
}
