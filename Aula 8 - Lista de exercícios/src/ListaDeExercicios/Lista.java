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
    public boolean isEmpty() { return (this.qtd == 0); }

    //Exist
    public boolean exist(int elem) {
        if (this.isEmpty())
            return false;

        No actual = this.beggin;

        while (actual != null) {
            if(actual.data == elem)
                return true;

            actual = actual.next;
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
            return;
        }

        if (pos == 0 && !this.isEmpty()){
            No newNo = new No(elem);

            newNo.next = this.beggin;
            this.beggin = newNo;
            this.qtd++;
            return;
        }

        if (pos == this.size()) {
            No newNo = new No(elem);

            this.end.next = newNo;
            this.end = newNo;
            this.qtd++;
            return;
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

    //Add at the end
    public void add(int elem) { this.add(elem, this.size()); }

    //Remove
    public int remove(int pos) {
        if (this.isEmpty() || pos >= this.size() || pos < 0) {
            System.out.println("Erro");
            return -1;
        }

        if (pos == 0 && this.qtd == 1) {
            No aux = this.beggin;
            this.beggin = null;
            this.end = null;

            this.qtd--;
            return aux.data;
        }

        if (pos == 0) {
            No aux = this.beggin;
            this.beggin = this.beggin.next;

            this.qtd--;
            return aux.data;
        }

        No before = this.beggin;
        int count = 0;

        while(count != pos-1) {
            before = before.next;
            count++;
        }

        No removed = before.next;
        before.next = removed.next;

        this.qtd--;
        return removed.data;
    }

    // Ex 1
    public boolean removeElem(int removedElem) {
        if (this.isEmpty()){
            return false;
        } else {
            No aux = this.beggin;
            No remove = new No(removedElem);

            while (aux != null) {
                if (remove.data == removedElem){
                    remove = remove.next;
                    this.qtd--;
                    return true;
                } else {
                    aux = aux.next;
                }
            }
            return false;
        }
    }

    //Ex 2
    public void unite(Lista lista){

        while (!lista.isEmpty()){
            this.add(lista.remove(0));
        }
    }

    //Ex 3
    public int bigger() {
        No aux = this.beggin;
        int bigger = 0;
        int count = 1;

        while (count != this.size()){

            int actual = aux.data;

            if (actual < aux.next.data){
                bigger = aux.next.data;
            } else {
                bigger = actual;
            }


            aux = aux.next;
            count++;
        }

        return bigger;
    }

}
