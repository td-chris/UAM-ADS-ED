public class Exemplo {

    public static void main(String[] args) {

        Racional R = new Racional(2,10);
        System.out.println("R: " + R);

        Racional M = new Racional(5,10);
        System.out.println("M: " + M);

        R.somar(M);


        System.out.println(R.getNumerador() + "/" + R.getDenominador());
    }
}
