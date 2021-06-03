package aula9;

public class ListaDupla {

    private No inicio;
    private No fim;
    private int qtd;

    // Construtor

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.qtd = 0;
    }

    // Tamanho
    public int size() {
        return this.qtd;
    }

    //Vazio
    public boolean isEmpty() {
        return (this.qtd == 0);
    }

}
