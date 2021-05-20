package Prova;

public class PilhaString {

    private char dados[];
    private int topo;

    public PilhaString(int max){
        this.dados = new char[max];
        this.topo = 0;
    }

    // Push
    public void push(char elem){
        if (this.dados.length > this.topo) {
            this.dados[this.topo] = elem;
            this.topo++;
        }
    }

    // Size
    public int size(){
        return this.topo;
    }

    // Pop
    public char pop(){
        if (this.topo > 0){
            this.topo--;
            return this.dados[this.topo];
        }else {
            System.out.println("Pilha vazia");
            return '?';
        }
    }

    // Full
    public boolean isFull(){
        if (this.topo == this.dados.length){
            return true;
        } else {
            return false;
        }
    }

    // Empty
    public boolean isEmpty() {
        if (this.topo == 0){
            return true;
        } else {
            return false;
        }
    }

    // Reset
    public void reset(){
        this.topo = 0;
    }
}
