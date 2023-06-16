package lista.de.exercicio.resilia;

public class Jogador extends lista.de.exercicio.resilia.Personagem {
    private int nivel;

    public Jogador(String nome, int vida, int nivel) {
        super(nome, vida);
        this.nivel = nivel;
    }

    public void usarItem(){
        System.out.println("Usou um item");
    }
}

// O psvm(teste) desse exercicio está no pacote test
