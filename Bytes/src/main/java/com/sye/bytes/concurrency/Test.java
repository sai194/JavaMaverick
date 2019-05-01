package com.sye.bytes.concurrency;
public class Test {
    public synchronized void testMethod1() {
        try { 
              Thread.sleep(2000);
        }
        catch (InterruptedException ie) {
        }
    }
    public synchronized void testMethod2() {
        try { 
                Thread.sleep(2000); 
       }
        catch (InterruptedException ie) {}
    }
    public static void main (String[] args) throws InterruptedException {
        final Test t = new Test();
        Thread t1 = new Thread() { public void run() { t.testMethod1(); } };
        Thread t2 = new Thread() { public void run() { t.testMethod2(); } };
        t1.start();
        Thread.sleep(500);
        t2.start();
        Thread.sleep(500);
        System.out.println("t1-> "+t1.getState());
        
        System.out.println("t2-> "+t2.getState());
    }
}