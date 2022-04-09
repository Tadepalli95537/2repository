package com.createiq.experiencelevel;

import java.util.ArrayList;

public class RemoveArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(60);
		a.add(40);
		a.add(20);
		a.add(70);
		System.out.println(a);
		for(Integer i:a) {
			System.out.println(i);
		}
		a.remove(2);
		a.remove(1);
		System.out.println(a);
		
	}

}
