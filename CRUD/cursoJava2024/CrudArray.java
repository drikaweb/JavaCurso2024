package cursoJava2024;

import java.util.Scanner;

public class CrudArray {

    // Arrays para armazenar nomes e idades
    static String[] nomes = new String[10];
    static int[] idades = new int[10];
    static int contador = 0; // Contador de usuários

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Inicializa a variável opção

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Exibir Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Deletar Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Corrigido para ler a opção

            switch (opcao) {
                case 1:
                    adicionarUsuario(scanner);
                    break;
                case 2:
                    exibirUsuario();
                    break;
                case 3:
                    atualizarUsuario(scanner);
                    break;
                case 4:
                    deletarUsuario(scanner);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);
        
        scanner.close();
    }

    // Adicionar usuário
    public static void adicionarUsuario(Scanner scanner) {
        if (contador < nomes.length) {
            System.out.print("Digite o nome: ");
            String nome = scanner.next(); // Lê o nome

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt(); // Lê a idade

            // Adiciona os valores no array
            nomes[contador] = nome;
            idades[contador] = idade;
            contador++;
            System.out.println("Usuário adicionado com sucesso!");
        } else {
            System.out.println("Limite de usuários atingido!");
        }
    }

    // Exibir usuários
    public static void exibirUsuario() {
        if (contador == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + " Nome: " + nomes[i] + ", Idade: " + idades[i]);
        }
    }

    // Atualizar usuário
    public static void atualizarUsuario(Scanner scanner) {
        System.out.print("Digite o número do usuário a ser atualizado: ");
        int index = scanner.nextInt() - 1; // Ajusta o índice

        if (index >= 0 && index < contador) {
            System.out.print("Digite o novo nome: ");
            String nome = scanner.next(); // Lê o novo nome
            System.out.print("Digite a nova idade: ");
            int idade = scanner.nextInt(); // Lê a nova idade

            // Atualiza o nome e a idade
            nomes[index] = nome;
            idades[index] = idade;
            System.out.println("Usuário atualizado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    // Deletar usuário
    public static void deletarUsuario(Scanner scanner) {
        System.out.print("Digite o número do usuário a ser deletado: ");
        int index = scanner.nextInt() - 1; // Ajusta o índice

        if (index >= 0 && index < contador) {
        }
    }
}