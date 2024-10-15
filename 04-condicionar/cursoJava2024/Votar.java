package cursoJava2024;

import java.util.Scanner;

class Votar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// pedir a idade do usuario;

		System.out.println("Digite sua idade:");

		int idade = scanner.nextInt();
		if (idade < 16) {
			System.out.println("Ops voce ainda nao tem idade para votar!");

		} else if (idade <= 16 && idade < 18 || idade > 65) {
			System.out.println(" Ops, seu voto é facultativo mas voce, exerca seu poder ao voto!");

		} else {
			System.out.println("Voce é obrigado a vota, evite pagar multas!");
		}
	}
}