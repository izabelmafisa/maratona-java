import curso.java.javacore.introducaoclasses.Carro;
import introducao.metodos.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest");
        calculadora.subtraiaDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,20);
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
