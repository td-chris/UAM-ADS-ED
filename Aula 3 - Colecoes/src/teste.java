public class teste {

    public static void main(String[] args) {

        colecoes C = new colecoes(15);

        C.inserir(15);
        C.inserir(19);
        C.inserir(19);
        C.inserir(13);
        C.inserir(19);
        C.inserir(0);

        if(C.busca(13)) {
            System.out.println("Valor 13 encontrado!");
        }else {
            System.out.println("Valor 13 não encontrado");
        }

        C.imprimir();
    }
}
