package com.kgcorner.thread.functions;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Running:"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
