package heranca;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização static de funcionario");
    }
    {
        System.out.println("Bloco de inicialização de funcionario1");
    }
    {
        System.out.println("Bloco de inicialização de funcionario2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + "Recebi o salario de:" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
