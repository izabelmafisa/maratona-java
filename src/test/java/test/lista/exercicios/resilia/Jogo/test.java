package test.lista.exercicios.resilia.Jogo;

import lista.de.exercicio.resilia.Jogador;
import lista.de.exercicio.resilia.Personagem;

public class test {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Jiraya",3);
        personagem.atacar();
        personagem.defender();

        Jogador jogador = new Jogador("Goku",4,6);
        jogador.usarItem();
        jogador.atacar();
        jogador.defender();
    }
}
