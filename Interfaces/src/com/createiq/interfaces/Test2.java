package com.createiq.interfaces;

public class Test2 {
	
		public static void main(String args[]) {
	
	InterfaceEx1 i=new InterfaceEx1() {
		
		@Override
		public void sub(int a, int b) {
			System.out.println(a+b);
			
			
		}
		
		@Override
		public void add(int a, int b) {
			System.out.println(a-b);
			
		}
	};
		}
		
	}



