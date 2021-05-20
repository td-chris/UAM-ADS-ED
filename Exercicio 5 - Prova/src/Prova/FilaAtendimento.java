package Prova;

public class FilaAtendimento {

    private FilaPessoas preferecial;
    private FilaPessoas outros;

    public FilaAtendimento(int tamanho) {
        this.preferecial = new FilaPessoas(tamanho);
        this.outros = new FilaPessoas(tamanho);
    }

    //Entrada
    public void inserir(Pessoa pessoa) {
        if (pessoa.tipo == "preferencial"){
            this.preferecial.entra(pessoa);
        } else {
            this.outros.entra(pessoa);
        }
    }

    //Saída
    public Pessoa retirar() {
        if (!this.preferecial.vazia()) {
            return this.preferecial.sai();
        } else {
            return this.outros.sai();
        }
    }

}
