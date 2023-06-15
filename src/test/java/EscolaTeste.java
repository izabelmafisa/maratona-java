import associacao.Escola;
import associacao.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores ={professor};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();
    }
}
