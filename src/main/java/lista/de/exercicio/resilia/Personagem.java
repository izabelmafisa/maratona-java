package lista.de.exercicio.resilia;
//Voc� est� desenvolvendo um jogo de RPG e precisa implementar um sistema de personagens.
// Crie as classes Personagem e Jogador usando heran�a.
// A classe Personagem deve ter os atributos nome e vida, al�m dos m�todos atacar() e defender().
// A classe Jogador deve herdar da classe Personagem e adicionar o atributo nivel e o m�todo usarItem().
public class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        System.out.println("Est� atacando");
    }
    public void defender(){
        System.out.println("Est� defendendo");
    }
}

// O psvm(teste) desse exercicio est� no pacote test