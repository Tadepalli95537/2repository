package com.createiq.arraylistex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(2);
		a.add(6);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
	}

}
