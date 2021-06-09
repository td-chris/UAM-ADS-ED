package aula9;

public class Teste {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.ordenedAdd(5);
        lista.ordenedAdd(6);
        lista.ordenedAdd(1);
        lista.ordenedAdd(10);
        lista.ordenedAdd(7);

        System.out.println("Resultado");

        System.out.println(lista.removeItem(10));
        System.out.println(lista.removeItem(1));
    }

}
