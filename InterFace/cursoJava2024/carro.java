package cursoJava2024;

public class carro  implements Veiculo {
  //Constutor sem paramatros(necessario para a linha 'new Carro'
	public carro() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("O carro vai acelerar");
	}
	@Override
	public void frear() {
		System.out.println("O carro vai frear!");
		
	}
}
