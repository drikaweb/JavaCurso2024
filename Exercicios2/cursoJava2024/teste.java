package cursoJava2024;

// Classe base Funcionario
public class Verificar {
    private String nome;

    // Construtor da classe Funcionario
    public Verificar(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome do funcionário
    public String getNome() {
        return nome;
    }
}

//Classe derivada Gerente que herda de Funcionario
class Gerente extends Verificar {

 // Construtor da classe Gerente
 public Gerente(String nome) {
     super(nome); // Chama o construtor da classe Funcionario
    }

    // Método para verificar se o funcionário é um gerente
    public String verificarCargo() {
        return "O funcionário " + getNome() + " é um gerente.";
    }
}

// Classe principal para testar o sistema

public class teste {
    public static void main(String[] args) {
        // Criando um objeto do tipo Gerente
        Gerente gerente = new Gerente("Maria");

        // Exibindo a verificação do cargo
        System.out.println(gerente.verificarCargo());
    }
}
