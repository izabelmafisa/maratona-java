package exercicioslista01;
//Informar um saldo e imprimir o saldo com reajuste de 1%.
import java.util.Scanner;

public class SaldoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();
        double saldoNovo = saldo+(saldo*0.01);
        System.out.println("Seu novo saldo é: "+ saldoNovo);
    }
}
