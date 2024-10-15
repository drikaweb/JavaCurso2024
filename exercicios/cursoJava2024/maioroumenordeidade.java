package cursoJava2024;

import java.util.Scanner;

public class maioroumenordeidade {
	public static void main(String[] args) {
		  
		Scanner scanner = new Scanner (System.in);
		
		
		// Ver se uma pessoa é maior de idade ou nao
		System.out.println("Fala ai tua idade irmão:");
		int idade = scanner.nextInt();
		
		if (idade >= 18 ) {
		System.out.println("Tu é de maior, relaxa!");
		
		} else {
			System.out.println("Tu é de menor, vai embora!");
		}
		
	}
}
