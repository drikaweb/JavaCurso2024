package cursoJava2024;

public class FormaDePagamento {
 public static void main(String[] args) {
	Pagamentos valor = new Boleto(150, 54);
	
	valor.pagar();
	valor.dever();
	
	
}
}
