package com.thread.multi.java;

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; 
        for (int i = 0; i < n; i++) 
        {
            MultithreadSample obj = new MultithreadSample();
            obj.start();
            obj.run();
        }
	}

}
