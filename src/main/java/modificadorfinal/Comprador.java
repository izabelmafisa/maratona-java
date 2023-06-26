package modificadorfinal;

public class Comprador {
    private String nome;
    public static final double VELOCIDADE_LIMITE=250;
    private final Comprador COMPRADOR  = new Comprador();

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
