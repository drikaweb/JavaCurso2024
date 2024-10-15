package cursoJava2024;

import java.util.Scanner;

public class BasexAltura {
  
        public static void main(String[] args) {
	//Somar a base x altura x a area e ver o resultado:
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Qual é a base e a altura do meu reângulo?");
    	 int base = scanner.nextInt();
    	 int altura = scanner.nextInt();
    	 int mutiplique = base * altura;
    	 System.out.println("A soma dele é" +mutiplique);
}
}
