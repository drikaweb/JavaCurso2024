package cursoJava2024;

import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Me fale um número.");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Seu número é par!Menos você!");
			
		} else {
			System.out.println("Seu número é impar!É como você!");
	}

}
} 