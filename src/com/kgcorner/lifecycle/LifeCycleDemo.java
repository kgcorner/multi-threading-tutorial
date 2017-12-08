package com.kgcorner.lifecycle;

public class LifeCycleDemo {
	/***
	 * Thhis method shows different life cycles of thread:
	 * New -> When thread is just created
	 * Runnable-> When thread is ready to run
	 * Running->When thread is runnning
	 * Terminated -> when thread is terminated
	 */
	public static void demo() {
		Thread thread = new Thread( new MyRunnable());
		System.out.println("From main, State:"+thread.getState().name());
		thread.start();
		System.out.println("From main, State:"+thread.getState().name());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("From main, State:"+thread.getState().name());
	}
	
	/***
	 * Trying to restart thread throws exception
	 */
	public static void reStartThreadDemo() {
		Thread thread = new Thread( new MyRunnable());
		System.out.println("From main, State:"+thread.getState().name());
		thread.start();
		System.out.println("From main, State:"+thread.getState().name());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("From main, State:"+thread.getState().name());
		thread.start();
	}
}
