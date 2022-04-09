package com.createiq.beginnerslevel;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(60);
		a.add(20);
		a.add(90);
		a.add(80);
		a.add(10);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
	} 

}
