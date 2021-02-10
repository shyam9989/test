package com.shyam.core;

public class ReverseStringExample {
	
	public static void main(String args[]) {
		String s="java is an object oriented programming language";
		
		reverse(s,(s.length())-1);
	}

	private static void reverse(String s, int i) {
		// TODO Auto-generated method stub
		//System.out.println(i);
		if(i>-1) {
			System.out.print(s.charAt(i));
			reverse(s, i-1);
		}
		
	}

}
