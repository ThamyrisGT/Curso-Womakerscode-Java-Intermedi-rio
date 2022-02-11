package com.loiane.cursojava.classes.utilitarias;

public class Aula85Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3));  // elevado

		System.out.println(Math.round(4.7)); // arredondamento

		System.out.println(Math.round(4.4)); // arredondamento

		System.out.println(Math.ceil(4.4)); //arredondamento pra cima

		System.out.println(Math.ceil(4.7)); // arredondamento pra cima

		System.out.println(Math.floor(4.4)); //arredondamento pra baixo

		System.out.println(Math.floor(4.7));// arredondamento pra baixo

		System.out.println(Math.round(Math.random() * 100)); // gera número aleatorio e arredonda

		System.out.println(Math.sin(Math.toRadians(30)));

		System.out.println(Math.cos(Math.toRadians(1)));

		System.out.println(Math.tan(Math.toRadians(45)));

	}
}
