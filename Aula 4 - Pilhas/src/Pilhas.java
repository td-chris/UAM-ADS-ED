public class Pilhas {
    // Pilhas são conhecidas como stack

    // Stack estática - usando vetores

    // Stack estática de int

    private int dade[];
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

}
