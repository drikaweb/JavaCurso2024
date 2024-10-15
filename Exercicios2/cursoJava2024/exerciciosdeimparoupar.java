package cursoJava2024;

import java.util.Scanner;

public class exerciciosdeimparoupar {
  Scanner scanner = new Scanner(System.in);
  
   System.out.println("Escolha ímpar ou par:");
    String EscolhaJogador = scanner.nextLine().toLowerCase();
   
      System.out.pritnln("Digite o número que desejar:");
       int numerojogador = scanner.nextInt();
        
       int soma = numerojogador + 1;
       
       System.out.println("Sua soma é;" +soma);
       
       if(soma%2==0&&escolhaJogador.equals("par")){
    	   System.out.println("Você venceu, parabéns!:");
       } else if (soma %2 != 0 && escolhaJogador.equals ("ímpar")) {
    	   System.out.println("Você venceu novamnete, é um número ímpar!");
       } else {
    	   System.out.println("Você perdeu, tenta de novo querida(o)!");
    	   
       }
       
       scanner.close();

}
}