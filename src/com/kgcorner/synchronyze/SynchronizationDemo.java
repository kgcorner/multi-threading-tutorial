package com.kgcorner.synchronyze;

/***
 * Demo for showing Synchronized blocks behaviour
 * @author kumar
 *
 */
public class SynchronizationDemo {	
	
	/***
	 * synchronized methods takes object level lock
	 * hence two or more threads can't access same or different synchronized methods simultaneously
	 */
	public static void runMethodLevelSynchronization() {
		Resource resource =  new Resource();
		Thread r1 = new Thread(new MyRunnable(true, resource));
		Thread r2 = new Thread(new MyRunnable(false, resource));
		r1.start();
		r2.start();
	}
	
	/***
	 * Class level Locking 
	 */
	public static void runClassLevelLockingDemo() {
		ClassLevelLockedResource resource = new ClassLevelLockedResource();
		Thread r1 = new Thread(new ClassLevelLockingDemoRunnable(true, resource));
		Thread r2 = new Thread(new ClassLevelLockingDemoRunnable(false, resource));
		r1.start();
		r2.start();
	}
	
	/***
	 * Locking with this
	 */
	public static void runLockWithThisDemo() {
		LockWithThisResource resource = new LockWithThisResource();
		//LockWithThisResource resource1 = new LockWithThisResource();
		Thread r1 = new Thread(new LockWithThisRunnableDemo(true, resource));
		Thread r2 = new Thread(new LockWithThisRunnableDemo(false, resource));
		r1.start();
		r2.start();
	}
}
