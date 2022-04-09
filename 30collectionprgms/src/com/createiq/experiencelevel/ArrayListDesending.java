package com.createiq.experiencelevel;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDesending {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(90);
		a.add(10);
		a.add(100);
		a.add(50);
		System.out.println(a);
		for(Integer i:a) {
			System.out.println(i);
		}
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
		for(Integer i:a) {
			System.out.println(i);
		}
		
		
	}

}
