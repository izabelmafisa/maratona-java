package introducao.metodos;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeSalario(){
        double media=0;
        for (double salario :salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println(" \n Média salarial " + media);
    }
}
