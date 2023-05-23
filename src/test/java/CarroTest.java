import curso.java.javacore.introducaoclasses.Carro;

import java.util.concurrent.Callable;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1= new Carro();
        Carro carro2= new Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo ="Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo ="GT 500";
        carro2.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
