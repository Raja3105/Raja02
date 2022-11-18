package com.cons;

public class Test {
	public Test() {
		System.out.println("DEFAULT CONSTRUCTOR/NON PARAMETERIZED CONSTRUCTOR");
	}
	public Test(String name) {
		System.out.println("PARAMETERIZED CONSTRUCTOR:"+name);
	}
	public static void main(String[]args) {
		Test t =new Test();
		Test t1 =new Test("RAJA");
	}

}
