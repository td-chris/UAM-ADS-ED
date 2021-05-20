package Ex;

//TAD Fila dinâmica de inteiros

public class Fila {

    private No inicio;
    private No fim;
    private int total;

    //Construtor
    public Fila() {
        this.inicio= null;
        this.fim = null;
        this.total = 0;
    }

    //Inserir

    public void entra(int elem) {
        No novo = new No(elem);

        if (this.total == 0) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.prox = novo;
            this.fim = novo;
        }

        this.total++;
    }

}
