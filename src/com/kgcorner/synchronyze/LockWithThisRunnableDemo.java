package com.kgcorner.synchronyze;

public class LockWithThisRunnableDemo implements Runnable {

	private boolean flag;
	private LockWithThisResource resource;
	public LockWithThisRunnableDemo(boolean flag, LockWithThisResource resource) {
		this.flag = flag;
		this.resource = resource;				
	}
	
	@Override
	public void run() {
		if(this.flag) {
			this.resource.readMe();
		}
		else {
			this.resource.writeMe();			
		}		
	}
}
