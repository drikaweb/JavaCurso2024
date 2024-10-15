package cursoJava2024;

public class Idadeparavotar {
   public static void main(String [] args) {
	   //Idade para votar:
	  int idade = 20;
	   
	  //Só colocar o número acima:
	  
	 if ( idade == 16) {
	  System.out.println("é opcional a votar");
	   
   } else if (idade < 16) {
	 System.out.println("Nao pode votar");
	 
   } else if ( idade > 16) {
	   System.out.println("Pode votar");
   }
}
}