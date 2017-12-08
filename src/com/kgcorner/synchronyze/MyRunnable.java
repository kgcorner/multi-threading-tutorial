package com.kgcorner.synchronyze;

public class MyRunnable implements Runnable {

	private boolean flag;
	private Resource resource;
	public MyRunnable(boolean flag, Resource resource) {
		this.flag = flag;
		this.resource = resource;				
	}
	
	@Override
	public void run() {
		if(this.flag) {
			this.resource.longTask1();
		}
		else {
			this.resource.longTask2();
		}
		
	}

}
