package org.introducao;

public class Repeticao {
    /*public static void main(String[] args){
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }

    }*/
    public static void main(String[] arg){
        double valorTotal=30000;
        for (int parcela = 1; parcela <=valorTotal ; parcela++) {
            double valorParcela= valorTotal/parcela;
            if (valorParcela>=1000){
                System.out.println("Parcela " +parcela+ "$ " +valorParcela);
            }
            else {
                break;
            }

        }
    }
    
}
