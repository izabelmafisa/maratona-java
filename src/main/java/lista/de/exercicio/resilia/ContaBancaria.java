package lista.de.exercicio.resilia;
//Escreva um programa em Java que crie uma classe com atributos privados
// para armazenar o n�mero de uma conta banc�ria e o saldo atual.
// Crie m�todos p�blicos que permitam acessar e modificar esses atributos,
// al�m de realizar as opera��es de dep�sito, onde acrescente um valor inteiro ao saldo,
// e uma de saque, onde diminua o valor do saldo atual.
public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
       saldo += valor;
        System.out.println("Dep�sito de " + valor + " realizado com sucesso.");


}
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}

// O teste do exercicio est� na pasta de testes.
