public class teste {
    public static void main(String[] args) {
        Pilhas P = new Pilhas(10);

        P.push(88);
        P.push(150);
        P.push(55);
        P.push(33);
        P.push(20);
        P.push(52);
        P.push(74);
        P.push(38);
        P.push(13);

        System.out.println("Size = " + P.size());

        System.out.println("Pop = " + P.pop());
    }
}
