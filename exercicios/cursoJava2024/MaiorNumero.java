package cursoJava2024;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Comparando os números e exibindo o maior
        int maior = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("O maior número é: " + maior);

        // Fechando o Scanner
        scanner.close();
    }
}
