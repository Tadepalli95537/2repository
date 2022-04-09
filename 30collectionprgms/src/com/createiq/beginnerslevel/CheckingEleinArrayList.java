package com.createiq.beginnerslevel;

import java.util.ArrayList;

public class CheckingEleinArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(8);
		a.add(5);
		a.add(10);
		a.add(20);
		a.add(15);
		a.add(5);
		System.out.println(a);
		System.out.println(a.contains(20));
		if(a.contains(5)) {
			System.out.println("element is found");
			
		}else {
			System.out.println("element is not found"); 
		}
		
	}

}
