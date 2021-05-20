package Ex;

//TAD Fila dinâmica de double

public class Lista {

    private No inicio;
    private No fim;
    private int qtd;

    //Construtor
    public Lista() {
        this.inicio= null;
        this.fim = null;
        this.qtd = 0;
    }

    // Tamanho
    public int size() {
        return this.qtd;
    }

    // Vazio
    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Inserir

    public void entra(int elem) {
        No novo = new No(elem);

        if (this.qtd == 0) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.prox = novo;
            this.fim = novo;
        }

        this.qtd++;
    }

}
