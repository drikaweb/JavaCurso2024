package cursoJava2024;

public class Switch {

	public static void main(String[] args) {
		int mês = 5;

		switch (mês) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Maço");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break; 
			default:
				System.out.println("Mês invalido!");

		}

	}
}