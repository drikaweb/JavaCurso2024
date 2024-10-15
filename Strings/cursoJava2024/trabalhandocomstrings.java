package cursoJava2024;

public class trabalhandocomstrings {

	public static void main(String[] args) {
		String texto = "Bem vindo ao curso da Java.";
		String texto2 = "Vamos aprender sobre String.";

		// 1.Comprimento da String;
		String nome = "Adrielly Oliveira da Silva";
		System.out.println("Comprimento da String:" + texto.length());

		// 2.Concatenar Strings;
 	    String textoCompleto = texto + texto2;
//		System.out.println("Texto copmpleto: " + textoCompleto);
//		String nome1 = "Meu nome é Adrielly ";
//		String sobreNome = "Oliveira da Silva, e agora vamos começar... ";
//		System.out.println(nome1 + sobreNome); 

		// 3.Converter para Maiusculas & Minusculas;
		System.out.println("Minusculas;" + texto.toLowerCase());
		System.out.println("Maiusculas;" + texto.toUpperCase());

		// 4.Substituir uma parte da String;
		String novotexto = texto.replace("Java", "Drika");

		System.out.println(novotexto);

		// 5.Buscar uma Substring;
		int posicao = texto.indexOf("curso");
		System.out.println("Posição da palavra 'curso' : " + posicao);

		// 6.Verificar se uma string começa ou termina como uma substring;
		System.out.println("Começa com 'Bem':" + texto.startsWith("Bem"));
		System.out.println("Final com 'Java.':" + texto.endsWith("Java."));
		
		//7.Dividir String;
		String [] palavras = textoCompleto.split("");
		System.out.println("Palavras no texto completo:");
		for (String palavra: palavras) {
			System.out.println(palavra);
			
			//8.Remover espaçoc em branco;
			String textoCompleto1 = "      texto com espaços     ";
			System.out.println("Texto sem espaços: '" + textoCompleto1.trim() + "'");
		}

	}

}
