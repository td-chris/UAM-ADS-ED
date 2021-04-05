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
            return false
    }
}
