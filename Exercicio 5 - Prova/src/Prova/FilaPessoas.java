package Prova;

public class FilaPessoas {

    private Pessoa dados[]; //Armazenamento de pessoas na fila
    private int inicio;
    private int fim;
    private int total;

    // Construtor
    public FilaPessoas(int tamanho) {
        this.dados = new Pessoa[tamanho]; //Iniciar uma fila de Pessoas
        this.total = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    // Esta vazio?
    public boolean vazia() {
        return (this.total == 0);
    }

    // Esta cheia ?
    public boolean cheia (){
        return (this.total == this.dados.length);
    }

    //Inserir
    public void entra(Pessoa pessoa) {
        if(this.cheia()){
            System.out.println("Fila cheia!");
        } else {
            this.dados[this.fim] = pessoa;
            this.fim++;
            if(this.fim == this.dados.length) {
                this.fim = 0;
            }

            this.total++;

            // Explicação - se não estiver cheia, adiciona um objeto da classe Pessoa aos dados da fila
        }
    }

    //Remover
    public Pessoa sai() {
        if (this.vazia()) {
            System.out.println("Fila vazia");
            Pessoa vazia = new Pessoa("Pessoa não existe", "invalida");
            return vazia;
        }else {
            Pessoa pessoa = this.dados[this.inicio];

            this.inicio++;
            if (this.inicio == this.dados.length)
                this.inicio = 0;

            this.total--;

            return pessoa;

            // Explicação - se estiver vazia retorna uma pessoa invalida, se não retorna a primeira pessoa da fila
        }
    }

    // Tamanho
    public int tamanho() {
        return  this.total;
    }

    //Resetar
    public void reset() {
        this.total = 0;
        this.inicio = 0;
        this.fim = 0;
    }

}
