package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner (System.in);
	 //Entrada de valores:
	 System.out.println("------------------------");
	 System.out.println("Caucladora de juros simples do grupo Queen...");
	 System.out.println("-------------------------------------------");
	 System.out.println("Digite o capital: ");
	 double capital = scanner.nextDouble();
	 
	  System.out.println("Digite a taxa de juros (%):");
	   double taxa = scanner.nextDouble();
	   
	   System.out.println("Digite o tempo:");
	   int tempo = scanner.nextInt();
	   
	   //Cauclandos os juros:
	   double juros = (capital * taxa * tempo)/100;
	   System.out.println("o valor dos juros são:" +juros);
	   
	   //resultado
	 double total = capital + juros;
	 System.out.println("O total do investimento + juros é de: " +total);
	 
	 scanner.close();
	}

}
