package com.kgcorner.synchronyze;

public class ClassLevelLockingDemoRunnable implements Runnable {

	private boolean flag;
	private ClassLevelLockedResource resource;
	public ClassLevelLockingDemoRunnable(boolean flag, ClassLevelLockedResource resource) {
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
