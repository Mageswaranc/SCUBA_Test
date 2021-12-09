package com.reglarexp.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		boolean b3 = Pattern.matches(".s", "as2");  
		
		System.out.println(b+" "+b2+" "+b3);  
	}

}
