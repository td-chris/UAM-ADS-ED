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

    // buscar
    public boolean exist(double elem) {
        if (this.isEmpty())
            return false;

        No atual = this.inicio;

        while (atual != null) {
            if (atual.dado == elem)
                return true;

            atual = atual.prox;
        }

        return false;
    }

    //Inserir em posição
    public void add(double elem, int pos) {
        if (pos > this.size() || pos < 0)
            return;

        if (this.isEmpty() && pos == 0) {
            No novo = new No(elem);
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            return;
        }

        if (pos == 0) {
            No novo = new No(elem);
            novo.prox = this.inicio;
            this.inicio.ant = novo;
            this.inicio = novo;
            this.qtd++;
            return;
        }

        if (pos == this.size()) {
            No novo = new No(elem);
            novo.ant = this.fim;
            this.fim.prox = novo;
            this.fim = novo;
            this.qtd++;
            return;
        }

        No novo = new No(elem);

        No anterior = this.inicio;
        int cont = 0;

        while (anterior != null){
            if (cont == pos -1){
                break;
            }

            anterior = anterior.prox;
            cont++;
        }

        No posterior = anterior.prox;
        anterior.prox = novo;
        novo.ant = anterior;

        posterior.ant = novo;
        novo.prox = posterior;

        this.qtd++;
    }

    //Remover da posição

    public double remove(int pos) {
        if(pos >= this.size() || pos< 0 || this.isEmpty()){
            System.out.println("Erro!");
            return -1.0;
        }

        if(pos == 0 && this.size() == 1) {
            No removido = this.inicio;

            this.inicio = null;
            this.fim = null;
            this.qtd--;

            return removido.dado;
        }

        if (pos == 0) {
            No removido = this.inicio;

            this.inicio = this.inicio.prox;
            this.inicio.ant = null;

            this.qtd--;
            return removido.dado;
        }

        if(pos == this.size()-1) {
            No removido = this.fim;
            this.fim = this.fim.ant;
            this.fim.prox = null;

            this.qtd--;
            return removido.dado;
        }

        No removido = this.inicio;
        int cont = 0;

        while (removido != null) {

            if (cont == pos)
                break;

            removido = removido.prox;
            cont++;
        }

        No anterior = removido.ant;
        No proximo = removido.prox;

        anterior.prox = proximo;
        anterior.ant = anterior;

        this.qtd--;
        return removido.dado;
    }

    // Ex 1 - Adição ordenada

    public void ordenedAdd(double elem) {
        No atual = this.inicio;
        int cont = 0;

        while(atual != null) {
            if (atual.dado > elem)
                break;

            atual = atual.prox;
            cont++;
        }

        this.add(elem, cont);
    }

    // Ex 2 - escolher o elemento a ser removido

    public boolean removeItem(double elem){
        if (this.isEmpty()){
            System.out.println("Erro");
            return false;
        }

        No atual = this.inicio;
        int cont = 0;

        while (atual != null) {
            if (atual.dado == elem)
                break;

            atual = atual.prox;
            cont++;
        }

        if (atual != null){
            this.remove(cont);
            return true;
        } else {
            return false;
        }
    }
}
