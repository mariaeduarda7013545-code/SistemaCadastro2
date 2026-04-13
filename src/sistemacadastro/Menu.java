
package sistemacadastro;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        switch (opcao) {
            case 1:
                System.out.println("1.[Cadastrar pessoas]:");
                break;
                case 2:
                System.out.println("2.[Listar pessoas]: ");
                break;
                case 3:
                System.out.println("3.[Sair]: ");
                break;
            default:
                System.out.println("[Opção Inválida!]");
        }
        
        System.out.println("Escolha uma opção: "+ opcao);
        
    }

}
