package Fila;

public class Fila {
    private int dados[]; //Armazenamento
    private int inicio;
    private int fim;
    private int total;

    // Construtor
    public Fila(int tamanho) {
        this.dados = new int[tamanho];
        this.total = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    // Esta vazio?

}
