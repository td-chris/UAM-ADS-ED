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

            this.end.next = this.end;
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
    public void add(int elem) {
        this.add(elem, this.size());
    }

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

                    return true;
                } else {
                    aux = aux.next;
                }
            }
            return false;
        }
    }

}
