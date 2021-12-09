package com.java.arraylistColl;

import java.util.*;
import java.util.Iterator;

public class ArrayListJava {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");  
		list.add("C");  
		list.add("D");  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 

	}

}
