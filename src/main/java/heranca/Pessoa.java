package heranca;

public class Pessoa {
    protected   String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização static de pessoa");
    }
    {
        System.out.println("Bloco de inicialização de pessoa1");
    }
    {
        System.out.println("Bloco de inicialização de pessoa2");
    }
    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa");
    }


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+ this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
