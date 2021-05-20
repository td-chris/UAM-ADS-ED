package Prova;

public class teste {
    public static void main(String[] args) {
        Pessoa chris = new Pessoa("chris", "outros");
        Pessoa tay = new Pessoa("tay", "outros");
        Pessoa alguem = new Pessoa("alguem", "preferencial");

        FilaAtendimento f = new FilaAtendimento(10);

        f.inserir(tay);
        f.inserir(alguem);
        f.inserir(chris);

        System.out.println(f.retirar().nome);
        System.out.println(f.retirar().nome);
        System.out.println(f.retirar().nome);


    }
}
