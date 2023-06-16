package lista.de.exercicio.resilia;
//Você está desenvolvendo um jogo de RPG e precisa implementar um sistema de personagens.
// Crie as classes Personagem e Jogador usando herança.
// A classe Personagem deve ter os atributos nome e vida, além dos métodos atacar() e defender().
// A classe Jogador deve herdar da classe Personagem e adicionar o atributo nivel e o método usarItem().
public class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        System.out.println("Está atacando");
    }
    public void defender(){
        System.out.println("Está defendendo");
    }
}

// O psvm(teste) desse exercicio está no pacote test