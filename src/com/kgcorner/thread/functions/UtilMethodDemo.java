package com.kgcorner.thread.functions;

public class UtilMethodDemo {
	/***
	 * Join method lets the current thread wait for thread on which join is called
	 * here main thread will wait till completion of thread1 on line 16
	 * and will wait for thread 3 at line 16
	 */
	public static void joinMethoddemo() {
		Thread t1 = new Thread(new MyRunnable(), "thread1");
		Thread t2 = new Thread(new MyRunnable(), "thread2");
		Thread t3 = new Thread(new MyRunnable(), "thread3");
		
		try {
			t1.start();
			t2.start();
			t1.join();
			t3.start();
			t3.join();
			if(t1.getState().name().equals("TERMINATED") && t2.getState().name().equals("TERMINATED") && t3.getState().name().equals("TERMINATED"))
				System.out.println("All thread shutdown");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
