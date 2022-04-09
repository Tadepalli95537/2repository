package com.createiq.beginnerslevel;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToListConversioon {
	public static void main(String[] args) {
		//Arrayinitialization
		String fruits[]= {"banana","apple","kiwi","orange","papaya"};
		//Array to ArrayList conversion
		ArrayList<String> frts=new ArrayList<String>(Arrays.asList(fruits));
		frts.add("Grapes");
		frts.add("pineApple");
		System.out.println(frts);
		for(String s:frts) {
			System.out.println(s);
		}
		
		
		
	}

}
