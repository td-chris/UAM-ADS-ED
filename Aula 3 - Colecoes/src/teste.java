public class teste {

    public static void main(String[] args) {

        colecoes C = new colecoes(15);

        C.inserir(15);
        C.inserir(19);
        C.inserir(19);
        C.inserir(13);
        C.inserir(19);
        C.inserir(0);
        C.inserir(5);

        if (C.deletar(13)){
            System.out.println("Valor 13 deletado");
        }else {
            System.out.println("Valor 13 não deletado");
        }

        C.imprimir();
    }
}
