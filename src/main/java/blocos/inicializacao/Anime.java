package blocos.inicializacao;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    //1- Alocado espa�o em mem�ria para objeto
    //2- Cada atributo de classe � criado e inicializado com valore default ou o que for passado
    //3- Bloco de inicializa��o � executado
    //4- Construtor � executado

    static {
        System.out.println("Dentro do bloco de inicializa��o");
    }
    public Anime() {
        episodios = new int[100];{
            for (int i = 0; i < episodios.length ; i++) {
                episodios[i] = i+1;
            }
        }
        for (int episodio : this.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
