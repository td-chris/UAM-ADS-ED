package Fila;

public class teste {
    public static void main(String[] args) {
//     Ex 1 - Faca uma rotina para verificar se os elementos
//     de uma fila estão ordenados de forma crescente.
//     Método destrutivo:

//        Fila f = new Fila(5);
//
//        f.entra(1);
//        f.entra(2);
//        f.entra(3);
//        f.entra(4);
//
//        int a1 = f.sai();
//
//        while (!f.vazia()) {
//            int a2 = f.sai();
//            if (a1>a2){
//                System.out.println("Fila Não é crescente");
//                return;
//            }
//
//            a1 = a2;
//        }
//
//        System.out.println("Fila é crescente!");


//     Ex 1 - Faca uma rotina para verificar se os elementos
//     de uma fila estão ordenados de forma crescente. A fila deve terminar
//     como começou
//     Método nao destrutivo:

        Fila f = new Fila(5);
        String aux = "Fila é crescente";

        f.entra(1);
        f.entra(2);
        f.entra(3);
        f.entra(4);

        int tam = f.tamanho();

        int a1 = f.sai();
        f.entra(a1);

        for (int i = 1; i < tam; i++){
            int a2 = f.sai();
            f.entra(a2);

            if (a1>a2) {
                aux = "Fila não é crescente";
            }

            a1 = a2;
        }

        System.out.println(aux);
        while (!f.vazia())
            System.out.println(f.sai());
    }
}
