package com.kgcorner.synchronyze;

public class Resource {
	
	public synchronized void longTask1() {
		System.out.println("Long Task1 running");
		try {
			Thread.sleep(5000);
			System.out.println("Long Task1 completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void longTask2() {
		System.out.println("Long Task2 running");
		System.out.println("Long Task2 completed");
	}

}
