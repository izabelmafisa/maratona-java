package construtores;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;

    public Anime(String nome){
        this.nome= nome;

    }

    public void  init(String nome, String tipo, int episodio){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
    }

    public void init(){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
    }
}
