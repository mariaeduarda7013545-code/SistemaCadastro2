package sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // VETOR DE OBJETOS 

        ArrayList<Pessoa> listaCadastrados = new ArrayList<>();

        //FUNÇÃO CADASTRAR
        cadastrar(listaCadastrados);

        //EXIBIR LISTA DE CADASTRO
        for (int i = 0; i < listaCadastrados.size(); i++) {

            System.out.println("cadastrados:\n ");
            listaCadastrados.get(i).exibirDados();

        }

        s.close();//FECHAR SCANNER
    }

    public static void cadastrar(ArrayList list) {
        Scanner s = new Scanner(System.in);

        int op = 0;

        do {
            op = 0;
            System.out.println("Deseja cadastrar uma pessoa  ?");
            System.out.println("1. sim  // 2.não ");
            op = s.nextInt();
            if (op == 1) {
                Pessoa p = new Pessoa();

                System.out.println("Para cadastar uma pessoa digite o nome :");
                p.setNome(s.next());
                System.out.println("Digite a idade dessa pessoa :");
                p.setIdade(s.nextInt());

                s.nextLine();
                System.out.println("Digite o CPF dessa pessoa :");
                p.setCpf(s.next());

                list.add(p);

            } else if (op != 2 && op != 1) {
                System.out.println("Opção inválida");

            }
        } while (op != 2);

    }

}
