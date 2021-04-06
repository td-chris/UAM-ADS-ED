import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        // exercicio 1
//        Stack s = new Stack();
//
//        s.push(3.8);
//        s.push(4.5);
//        s.push(5);
//        s.push(6.99);
//
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());

        // exercicio 2 - Notação pós fixa (+ - * /)

        Stack s = new Stack();

        Scanner entrada = new Scanner(System.in);

        String frase = entrada.nextLine();
        entrada.close();

        String fraseSeparada[] = frase.split(" ");

//        for (int i = 0; i < fraseSeparada.length; i++) {
//            String dado = fraseSeparada[i];
//        }

        for(String dado : fraseSeparada) {
            if (dado.equals("+")){
                double operador2 = s.pop();
                double operador1 = s.pop();

                double  resultado = operador1 + operador2;
                s.push(resultado);
            }else if (dado.equals("-")){
                double operador2 = s.pop();
                double operador1 = s.pop();

                double resultado = operador1 - operador2;
                s.push(resultado);
            }else if (dado.equals("*")){
                double operador2 = s.pop();
                double operador1 = s.pop();

                double resultado = operador1 * operador2;
                s.push(resultado);
            }else if (dado.equals("/")){
                double operador2 = s.pop();
                double operador1 = s.pop();

                double resultado = operador1 / operador2;
                s.push(resultado);
            } else{
                    double valor = Double.parseDouble(dado);
                    s.push(valor);
            }
        }

        if (s.size() == 1)
            System.out.println(s.pop());
        else
            System.out.println("Expressão incorreta");
    }
}
