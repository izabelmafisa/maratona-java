package modificadorfinal;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    private final Comprador COMPRADOR = new Comprador();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
