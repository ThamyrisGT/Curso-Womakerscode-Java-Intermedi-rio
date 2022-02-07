package com.loiane.cursojava.enums.testes;

import com.loiane.cursojava.enums.Data;
import com.loiane.cursojava.enums.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SEGUNDA;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);

	}

}
