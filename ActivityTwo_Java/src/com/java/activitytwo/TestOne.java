/**
 * 
 */
package com.java.activitytwo;


public class TestOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AccModifier obj=new AccModifier();
		
		int sum= obj.Add(obj.a, obj.c);
		int sub= obj.Sub(obj.c, obj.b);
		
		System.out.println("Add :"+sum);
		System.out.println("Sun :"+sub);
		
	}

}
