package com.kgcorner.synchronyze;

public class ClassLevelLockedResource {

	public void readMe() {		
		synchronized (ClassLevelLockedResource.class) {
			System.out.println("inside lock of read Me");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void writeMe() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (ClassLevelLockedResource.class) {
			System.out.println("inside lock of Write Me");			
		}
	}
}
