public class Stack {
    // Pilha de Nos inteiros

    private No topo;

    // Construtor
    public Stack() {
        this.topo = null;
    }

    // Está vazio?
    public boolean isEmpty() {
        if (this.topo == null)
            return true;
        else
            return false;
    }

    // Inserir
    public void push(int elem) {
        No novoNo = new No(elem);
        No aux = topo; // posição de memória atual de topo

        novoNo.prox = aux; // novoNo.prox recebe posição de memória atual de topo

        this.topo = novoNo; //topo aponta para o novoNo
    }

    // Remoção
    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
            return -1;
        }

        No aux = topo; // Posição atual de topo
        topo = topo.prox; // Pego próximo da pilha e coloco em topo

        return aux.dado;
    }
}
