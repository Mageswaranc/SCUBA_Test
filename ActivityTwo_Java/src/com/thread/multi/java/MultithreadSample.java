package com.thread.multi.java;

public class MultithreadSample {
	public void run()
    {
        try {
            
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
         
            System.out.println("Exception Found");
        }
    }

	public void start() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
