package com.createiq.beginnerslevel;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetEx {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<>();
	h.add("aaa");
	h.add("nnn");
	h.add("zzz");
	h.add("bbb");
	h.add("aaa");
	System.out.println(h);
	Iterator itr=h.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	
}
}

