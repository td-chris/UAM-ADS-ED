package ListaDeExercicios;

public class Teste {
    public static void main(String[] args) {
        Lista list = new Lista();
        Lista lista2 = new Lista();

        System.out.println(list.size());

        list.add(90);
        list.add(2);
        list.add(3);
        list.add(30);
        list.add(60);

        lista2.add(8);
        lista2.add(8);
        lista2.add(8);

        System.out.println(list.size());

        System.out.println("Maior");
        System.out.println(list.bigger());
        System.out.println();

        while (!list.isEmpty()){
            System.out.println(list.remove(0));
        }



    }
}
