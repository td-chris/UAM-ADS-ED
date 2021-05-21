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

    //Add
    public void add(int elem, int pos) {
        if (pos > this.size() || pos < 0)
            return;

        if (pos == 0 && this.isEmpty()) {
            No newNo = new No(elem);

            this.beggin = newNo;
            this.end = newNo;
            this.qtd++;
        }

        if (pos == 0 && !this.isEmpty()){
            No newNo = new No(elem);

            newNo.next = this.beggin;
            this.beggin = newNo;
            this.qtd++;
        }

        if (pos == this.size()) {
            No newNo = new No(elem);

            this.end.next = this.end;
            this.end = newNo;
            this.qtd++;
        }

        No newNo = new No(elem);

        No aux = this.beggin;
        int count = 0;

        while (count != pos-1){
            aux = aux.next;
            count++;
        }

        newNo.next = aux.next;
        aux.next = newNo;

        this.qtd++;
    }

}
