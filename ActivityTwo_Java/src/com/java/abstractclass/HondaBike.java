package com.java.abstractclass;

public class HondaBike extends Bike {
	void run()
	{
		System.out.println("Happy Journey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new HondaBike();
		obj.run();
		
	}

}
