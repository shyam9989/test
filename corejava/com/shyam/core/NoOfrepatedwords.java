package com.shyam.core;

import java.util.HashMap;

public class NoOfrepatedwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is is a language java";
		HashMap<String,Integer> map=new HashMap<>();
		String str[]=s.split(" ");
		
		for(String s2:str) {
			if(map.get(s2)!=null) {
				map.put(s2,map.get(s2)+1);
			}else {
			map.put(s2,1);
			}
		}
		
		System.out.println(map);
		
		  for(String s1:map.keySet()) 
		  { 
			  if(map.get(s1)>1) {
				  System.out.println("repeated word is " + s1 + " repeated for "+map.get(s1));
			  }
			  
		  }
		 

	}

}
