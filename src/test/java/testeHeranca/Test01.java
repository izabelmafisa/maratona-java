package testeHeranca;

import heranca.Endereco;
import heranca.Funcionario;
import heranca.Pessoa;

public class Test01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("59133264");
        Pessoa pessoa = new Pessoa("Pele");
        pessoa.setCpf("122443434");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("2222222");
        funcionario.setSalario(30000);
        System.out.println("--------");
        funcionario.imprime();
    }
}
