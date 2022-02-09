package com.loiane.cursojava.threads.test;

import com.loiane.cursojava.threads.MinhaThreadRunnable;

public class TesteRunnable {
	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
		// Thread t1 = new Thread(thread1);
		// t1.start();

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);

		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
	}

}