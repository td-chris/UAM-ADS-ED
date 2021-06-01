package ListaDeExercicios;

public class Teste {
    public static void main(String[] args) {
        Lista list = new Lista();
        Lista lista2 = new Lista();

        list.size();

        list.add(5);
        list.add(7);
        list.add(3);
        list.add(3);
        list.add(8);

        lista2.add(8);
        lista2.add(8);
        lista2.add(8);

        System.out.println(list.size());

        list.unite(lista2);

        System.out.println(list.size());

        while (!list.isEmpty()){
            System.out.println(list.remove(0));
        }



    }
}
