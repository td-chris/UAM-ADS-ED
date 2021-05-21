package ListaDeExercicios;

public class Lista {
    private No beggin;
    private No end;
    private int qtd;

    //Constructor
    public Lista() {
        this.beggin = null;
        this.end = null;
        this.qtd = 0;
    }

    //Size
    public int size() {
        return this.qtd;
    }

}
