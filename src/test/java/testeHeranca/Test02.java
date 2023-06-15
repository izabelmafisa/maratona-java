package testeHeranca;

import heranca.Funcionario;

public class Test02 {
    //0 - Bloco de inicialização estático de super classe é executado quando a JVM carregar classe pai
    //1 - Bloco de inicialização estático da sub classe é executado qunado a JVM carregar classe filha
    //2 - Alocado espaço em memória por objeto da superclasse
    //3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai
    //4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5 - Construtor é executado da superclasse
    //6 - Alocado espaço em memória por objeto da subclasse
    //7 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da subclasse
    //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    //9 - Contrutor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
