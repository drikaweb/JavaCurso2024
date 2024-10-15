package cursoJava2024;

public class IfTernarios {
public static void main(String[] args) {
	
	//transformar o if em ternario:
	int numero = 83;
	
	//Verifircar se o numero é impar ou par:
	
		String resultado = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println("O numero " +numero+ " é " +resultado);
	} 

}
