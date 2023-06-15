package test.lista.exercicios.resilia.Veiculo;

import lista.de.exercicio.resilia.Veiculo;
import lista.de.exercicio.resilia.Carro;
import lista.de.exercicio.resilia.Moto;



public class test {
    public static void main(String[] args) {
        Veiculo[] veiculo = new Veiculo[6];
        veiculo[0]= new Carro();
        veiculo[1]= new Moto();
        veiculo[2]= new Carro();
        veiculo[3]= new Moto();
        veiculo[4]= new Carro();
        veiculo[5]= new Moto();
        for (Veiculo veiculos:
             veiculo) {
            veiculos.acelerar();
        }
    }
}
