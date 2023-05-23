import introducao.metodos.Funcionarios;

public class TestFuncionario {
    public static void main(String[] args){
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.nome = "Sanji";
        funcionarios.idade = 23;
        funcionarios.salarios= new double[]{1200,987,32,2000};

        funcionarios.imprime();
        funcionarios.imprimeSalario();
    }

}
