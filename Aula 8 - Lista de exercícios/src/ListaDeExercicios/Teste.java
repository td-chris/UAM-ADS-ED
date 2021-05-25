package ListaDeExercicios;

public class Teste {
    public static void main(String[] args) {
        Lista list = new Lista();

        list.size();

        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);

        list.size();
        list.removeElem(3);

        list.size();
    }
}
