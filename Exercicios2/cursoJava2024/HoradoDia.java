package cursoJava2024;

import java.util.Scanner;

public class HoradoDia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Diga um horario...");
         int horario = scanner.nextInt();
		
         switch (horario) {
		case 6, 7, 8, 9, 10, 11:
			System.out.println("humm...!");
			break;
		case 12, 13, 14, 15, 16, 17:
			System.out.println("Boa tarde!");
			break;
		case 18, 19, 20, 21, 22, 23:
			System.out.println("Boa noite!");
			break;
		case 0, 1, 2, 3, 4, 5:
			System.out.println("Não perturbe!");
		break;
		default:
			System.out.println("Este horario não existe, tente novamnete.");
		}
         scanner.close();
	}
}