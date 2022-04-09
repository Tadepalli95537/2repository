package com.createiq.interfaces;

public class Test1 implements InterfaceEx1{

	
	public void add(int a, int b) {
		System.out.println(a +b);
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(10-20);
		
		
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add(30, 40);
		
		
		t.sub(0, 0);
	}

}
