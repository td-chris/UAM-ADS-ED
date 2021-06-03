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
            return;;
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

}
