package com.sye.bytes.concurrency;

public class RaceCondition {

	private volatile boolean flag = true;
	private final Object guard = new Object();

	// Invoked by multiple threads
	public void doStuff() {
		System.out.println("Trying to dostuff !!! " + Thread.currentThread().getName());
		flag = true;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag != true) {
			seemsUnreachable();// Massive failure
		}
		flag = false;
	}

	public void seemsUnreachable() {
		System.out.println("Should never be here !!! " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		RaceCondition race = new RaceCondition();
		Thread t1 = new Thread(() -> race.doStuff());
		Thread t2 = new Thread(() -> {
			race.flag = false;
		});
		Thread t3 = new Thread(() -> race.doStuff());
		t1.start();
		t2.start();
		t3.start();
		RaceCondition raceCorrect = new RaceCondition();
		Thread t4 = new Thread(() -> raceCorrect.doStuffCorrectly());
		Thread t5 = new Thread(() -> {
			raceCorrect.flag = false;
		});
		Thread t6 = new Thread(() -> raceCorrect.doStuffCorrectly());
		
		t4.start();
		t5.start();
		t6.start();
	}

	public void doStuffCorrectly() {
		System.out.println("Trying to dostuff correctly !!! " + Thread.currentThread().getName());
		synchronized (guard) {
			flag = true;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (flag != true) {
				seemsUnreachable();// Massive failure
			}
			flag = false;
		}
	}

}
