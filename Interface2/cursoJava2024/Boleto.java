package cursoJava2024;

public class Boleto implements Pagamentos{

	private boolean processar = false;
	
	
	
	@Override
	public void pagar(double valor) {
		
		System.out.println("Valor gerado para o boleto" +valor+ "Aguardando pagamento...");
		processar = false;
	}

	@Override
	public String obterStatus() {
		return null;
	}
}
