package com.createiq.beginnerslevel;

import java.util.ArrayList;

public class ArrayListLoop {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(5);
		a.add(3);
		a.add(25);
		System.out.println(a);
		for(Integer i:a)
		{
			System.out.println(i);
		}
	}

}
