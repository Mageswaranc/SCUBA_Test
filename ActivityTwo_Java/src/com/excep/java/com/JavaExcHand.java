package com.excep.java.com;

public class JavaExcHand {

	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try{  
			/* int a =200/0; */
			String s=null;  
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException  e)
		{
			System.out.println(e);
		}
		

	}

}
