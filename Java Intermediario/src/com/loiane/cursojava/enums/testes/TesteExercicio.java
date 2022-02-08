package com.loiane.cursojava.enums.testes;

import com.loiane.cursojava.enums.labs.Calculadora;

public class TesteExercicio {
	public static void main(String[] args) {

		double x = 2.0;
		double y = 3.0;

		for (Calculadora.Operacao op : Calculadora.Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}
}
