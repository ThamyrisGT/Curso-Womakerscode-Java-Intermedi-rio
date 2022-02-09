package com.loiane.cursojava.threads.test;

import com.loiane.cursojava.threads.MinhaThread;
import com.loiane.cursojava.threads.MinhaThreadAula73;

public class TesteAula73 {

	public static void main(String[] args) {

		MinhaThreadAula73 t1 = new MinhaThreadAula73("#1");
		MinhaThreadAula73 t2 = new MinhaThreadAula73("#2");

		System.out.println("Pausando a Thread #1");

		t1.suspend();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Pausando a Thread #2");

		t2.suspend();

		System.out.println("Resumindo a Thread #1");

		t1.resume();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Resumindo a Thread #2");

		t2.resume();

		System.out.println("Terminando a Thread #2");

		t2.stop();
	}
}
