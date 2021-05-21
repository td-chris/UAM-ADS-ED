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

    // Existe - busca - caminhar na lista
    public boolean exist(double elem) {
        if (this.isEmpty()){
            return false;
        }else {
            No atual = this.inicio;

            while (atual != null){
                if (atual.dado == elem){
                    return true;
                } else {
                    atual = atual.prox;
                }
            }

            return false;
        }
    }

    //Inserir
    public void add(double elem, int pos) {
        if (pos > this.size() || pos < 0)
            return;

        if (pos == 0 && this.isEmpty()) {
            No novoNo = new No(elem);

            this.inicio = novoNo;
            this.fim = novoNo;
            this.qtd++;
        }

        if (pos == 0 && !this.isEmpty()) {
            No novoNo = new No(elem);

            novoNo.prox = this.inicio;
            this.inicio = novoNo;
            this.qtd++;
        }

        if (pos == this.size()) {
            No novoNo = new No(elem);

            this.fim.prox = this.fim;
            this.fim = novoNo;
            this.qtd++;
        }

        No novoNo = new No(elem);

        No anterior = this.inicio;
        int count = 0;

        while(count != pos -1) {
            anterior = anterior.prox;
            count++;
        }

        novoNo.prox = anterior.prox;
        anterior.prox = novoNo;

        this.qtd++;
    }

    // Add no fim
    public void add(double elem) {
        this.add(elem, this.size());
    }

    //Remover
    public double remove(int pos) {
        if (this.isEmpty() || pos >= this.size() || pos < 0){
            System.out.println("Erro");
            return -1.0;
        }

        if (pos == 0 && this.qtd == 1) {
            No aux = this.inicio;
            this.inicio = null;
            this.fim = null;

            this.qtd--;
            return aux.dado;
        }

        if (pos == 0) {
            No aux = this.inicio;
            this.inicio = this.inicio.prox;

            this.qtd--;
            return aux.dado;
        }

        No anterior = this.inicio;
        int count = 0;

        while (count != pos-1) {
            anterior = anterior.prox;
            count++;
        }

        No removido = anterior.prox;
        anterior.prox = removido.prox;

        this.qtd--;
        return removido.dado;
    }

}
