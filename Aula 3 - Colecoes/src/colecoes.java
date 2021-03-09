public class colecoes {

    /*
    Coleção estática (com vetor) de inteiros
    Cada elemento novo será colocado no próximo espaço disponivel no vetor
    Buscar na coleção por um inteiro
    Deletar da coleção um inteiro
    Imprimir a coleção
     */

    private int dados[]; //Vetor da coleção
    private int num; //Posição da próxima inserção

    //construtor
    public colecoes(int maximo){
        this.dados = new int[maximo];
        this.num = 0;
    }

    //inserção
    public void inserir(int elem) {
        if (this.num < this.dados.length) {
            this.dados[num] = elem;
            this.num++;
        }
    }

    //Imprimir o vetor
    public void imprimir() {
        for (int i = 0; i < this.num; i++) {
            System.out.println(this.dados[i] + " ");
        }
    }

    //busca
    public boolean busca(int elem) {
        for (int i = 0; i < this.num; i++) {
            if (this.dados[i] == elem) {
                return true;
            }
        }
        return false;
    }
}
