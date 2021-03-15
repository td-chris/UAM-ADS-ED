public class Pilhas {
    // Pilhas são conhecidas como stack

    // Stack estática - usando vetores

    // Stack estática de int

    private int dados[];
    private int topo;

    // Construtor

    public Pilhas(int max) {
        this.dados = new int[max];
        this.topo = 0;
    }

    // Inserir
    public void  push(int elem) {
        if (this.dados.length > this.topo) {
            this.dados[this.topo] = elem;
            this.topo++;
        }
    }

    // Size
    public int size() {
        return this.topo;
    }

    // Remoção
    public int pop (){
        if (this.topo > 0){
            this.topo--;
            return this.dados[this.topo];
        } else {
            System.out.println("Pilha Vazia");
            return -1;
        }
    }

    // Cheia
    public boolean isFull() {
        if (this.topo == this.dados.length){
            return true;
        } else {
            return false
        }
    }

    // Vazia
    public boolean isEmpty(){
        if (this.topo == 0) {
            return true;
        } else {
            return false;
        }
    }
}
