package com.kgcorner.lifecycle;

public class MyRunnable implements Runnable{

	@Override
	public void run() {		
		System.out.println("Printing from run method, State:"+Thread.currentThread().getState().name());
	}
	
}
