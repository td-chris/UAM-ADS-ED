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
    public boolean vazia() {
//        if (this.total==0){
//            return true;
//        }else {
//            return false;
//        }

        return (this.total == 0);
    }

    // Esta cheia ?
    public boolean cheia (){
//        if (this.total == this.dados.length){
//            return true;
//        }else {
//            return false;
//        }

        return (this.total == this.dados.length);
    }

    //Inserir
    public void entra(int elem) {
        if(this.cheia()){
            System.out.println("Fila cheia!");
        } else {
            this.dados[this.fim] = elem;

            this.fim++;
            if(this.fim == this.dados.length) {
                this.fim = 0;
            }

            this.total++
        }
    }

}
