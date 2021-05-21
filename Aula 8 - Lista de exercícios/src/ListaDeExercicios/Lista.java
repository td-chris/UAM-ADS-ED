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

    //is Empty
    public boolean isEmpty() {
        if (this.qtd == 0)
            return true;
        else
            return false;
    }

    //Exist
    public boolean exist(int elem) {
        if (this.isEmpty())
            return false;
        else {
            No aux = this.beggin;

            while (aux != null) {
                if (aux.data == elem)
                    return true;
                else
                    aux = aux.next;
            }
        }

        return false;
    }

}
