package com.reverse;

public class StringReverse {

	public static void main(String[] args) {
		String name="aparna";
		String reverse="";
		for(int i=name.length()-1; i>=0;i--) {
			reverse = reverse + name.charAt(i);
		}
			System.out.println("Reverse of aparna is:" +reverse);
			
		

	}

}
