import javax.crypto.spec.PSource;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        //ex 1 Pilha de int
//        Pilhas P = new Pilhas(10);
//
//        P.push(88);
//        P.push(150);
//        P.push(55);
//        P.push(33);
//        P.push(20);
//        P.push(52);
//        P.push(74);
//        P.push(38);
//        P.push(13);
//
//        while (!P.isFull()) {
//            P.push(9999999);
//        }
//
//        System.out.println("Size = " + P.size());
//
//        while (!P.isEmpty()) {
//            System.out.println(P.pop());
//        }
//
//        System.out.println();
//        System.out.println(P.pop());

        // Ex 2 inverter string

//        String frase;
//        CharStack S;
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite a frase a ser invertida: ");
//        frase = entrada.nextLine();
//
//        S = new CharStack(frase.length());
//
//        for (int i = 0; i < frase.length(); i++){
//            S.push(frase.charAt(i));
//        }
//
//        while (!S.isEmpty()){
//            System.out.print(S.pop());
//        }
//
//        entrada.close();

        // ex 3 checar (), [], {}
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua expressão: ");
        String expressao = entrada.nextLine();

        CharStack S = new CharStack(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            char caracter = expressao.charAt(i);
            if (caracter == '(' || caracter == '[' || caracter == '{'){
                S.push(caracter);
            } else  if (caracter == ')' || caracter == ']' || caracter == '}') {
                char empilhado = S.pop();

                if (S.isEmpty()) {
                    System.out.println("Erro - Fechamento sem abertura");
                    System.out.println("Fechamento: " + caracter);
                    return;
                }else {


                    if (caracter == ')' && empilhado == '(')
                        continue;
                    if (caracter == ']' && empilhado == '[')
                        continue;
                    if (caracter == '}' && empilhado == '{')
                        continue;

                    System.out.println("Erro - Delimitador incorreto");
                    System.out.println("Abertura: " + empilhado);
                    System.out.println("Fechamento: " + caracter);
                    return;
                }
            }
        }
        if (S.isEmpty())
            System.out.println("Expressão correta");
        else System.out.println("Erro - Delimitador não fechado");
    }

}
