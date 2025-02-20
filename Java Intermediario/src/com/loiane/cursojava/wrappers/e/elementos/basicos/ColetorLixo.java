package com.loiane.cursojava.wrappers.e.elementos.basicos;

public class ColetorLixo {   // jvisualvm em prompt de comando para exibir quanto de mem�ria de maneira mais visual

	public static void obterMemoriaUsada() {

		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime(); // singleton

		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);

	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[10000000];
		Contato contato;

		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
			contatos[i] = contato;
		}

		System.out.println("Contatos criados");

		obterMemoriaUsada();

		contatos = null;

		Runtime.getRuntime().runFinalization();

		Runtime.getRuntime().gc();

		System.out.println("Contatos removidos da mem�ria");

		obterMemoriaUsada();
	}

}
