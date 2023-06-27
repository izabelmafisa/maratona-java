package exercicios03Lista;
//Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz
//12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto na viagem e a velocidade m�dia.
//Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE.
//Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a
//f�rmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade m�dia,
//tempo gasto, a dist�ncia percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tempo de viagem: ");
        double tViagem= scanner.nextDouble();
        System.out.println("Insira a velocidade m�dia: ");
        double velocidadeMedia= scanner.nextDouble();
        double distanciaPecorrida = tViagem*velocidadeMedia;
        double litrosUsados = distanciaPecorrida/12;

        System.out.println("Voc� percorreu: "+distanciaPecorrida+" Km/h");
        System.out.println("-------------");
        System.out.println("No tempo: "+tViagem+" horas");
        System.out.println("-----------");
        System.out.println("Sua velocidade m�dia foi: "+velocidadeMedia+" Km");
        System.out.println("-----------");
        System.out.println("e usou um total de litros: "+litrosUsados+" Litros");
    }
}
