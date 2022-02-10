package com.loiane.cursojava.strings;

public class Aula82 {

	public static void main(String[] args) {

		String alfabeto = String.join(", ", "A", "B", "C", "D"); // juntar pela ,
		System.out.println(alfabeto);

		String[] letras = alfabeto.split(", "); //delimitador
		for (String letra : letras) {
			System.out.println(letra);
		}

		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		PessoasString pessoa = new PessoasString(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
	}

}
