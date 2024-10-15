package cursoJava2024;

public class PositivosNegativos {

	public static void main(String[] args) {
      // ponha o valor:
		int valor = 20;
		
	// Criar validacoes:
		if ( valor < 0 ) {
			System.out.println("Valor Negativo,verifique o saldo da sua conta!");
		} else if (valor > 0) {
			System.out.println("Saldo positivo!");
		} else {
			System.out.println("Saldo nao disponivel, valor muito baixo, trabalhe!");
}
	}
}