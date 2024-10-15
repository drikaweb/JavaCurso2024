package cursoJava2024;

public class IfConciso {
public static void main(String[] args) {
		//Declarando variavel:
	int numero = 1;
	
	// Uso do if normal:
  /* if ( numero >= 10 ) {
		System.out.println("Valor maior/igual de 10");
		
	} else {
		System.out.println("Valor menor que 10");
	} */
	String resultado = ( numero >= 10 ) ? "Maior que 10" : "Menor que 10";
	System.out.println("O numero " +numero+ " é " +resultado);
}
}	