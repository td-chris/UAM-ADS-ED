public class teste {
    public static void main(String[] args) {
        Pilhas P = new Pilhas(10);
        CharStack C = new CharStack(5);

        P.push(88);
        P.push(150);
        P.push(55);
        P.push(33);
        P.push(20);
        P.push(52);
        P.push(74);
        P.push(38);
        P.push(13);

        while (!P.isFull()) {
            P.push(9999999);
        }

        System.out.println("Size = " + P.size());

        while (!P.isEmpty()) {
            System.out.println(P.pop());
        }

        System.out.println();
        System.out.println(P.pop());


    }
}
