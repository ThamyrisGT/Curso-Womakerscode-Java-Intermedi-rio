package com.loiane.cursojava.threads.test;

import com.loiane.cursojava.threads.ThreadTiqueTaque;
import com.loiane.cursojava.threads.TiqueTaque;

public class TesteAula72 {

	public static void main(String[] args) {

		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
