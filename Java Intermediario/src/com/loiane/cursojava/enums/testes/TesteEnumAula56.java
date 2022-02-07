package com.loiane.cursojava.enums.testes;

import com.loiane.cursojava.enums.Pessoa;
import com.loiane.cursojava.enums.TipoDocumento;

public class TesteEnumAula56 {

	public static void main(String[] args) {
		/*
		 * for (TipoDocumento doc : TipoDocumento.values()){ System.out.println(doc +
		 * " - " + doc.geraNumeroTeste()); }
		 */

		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);

		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);

	}

}
