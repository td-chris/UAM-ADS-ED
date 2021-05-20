package Prova;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String novaFrase = "";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        PilhaString p = new PilhaString(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            frase.toLowerCase();
            char letra = frase.charAt(i);

            if (letra == ' ') {
                while (!p.isEmpty()){
                    novaFrase = novaFrase + p.pop();
                    System.out.println(novaFrase);
                }
                novaFrase = novaFrase + letra;
            } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                p.push(letra);
                while (!p.isEmpty()){
                    novaFrase = novaFrase + p.pop();
                    System.out.println(novaFrase);
                }
            }else {
                p.push(letra);
            }
        }

        System.out.println(novaFrase);

    }
}
