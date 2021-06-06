package aula9;

// No duplamente encadeada

public class No {
    public double dado;
    public No prox;
    public No ant;

    //Construtor

    public No(double elem){
        this.dado = elem;
        this.prox = null;
        this.ant = null;
    }

}
