import associacao.Jogador;
import associacao.Time;

public class Jogadorteste02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");

        Time time = new Time("Selecao Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }

}
