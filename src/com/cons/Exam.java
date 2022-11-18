package com.cons;

public class Exam {
	public Exam() {
		this("ANURAJA");
		System.out.println("DEFAULT CONSTRUCTOR/NONPARAMETERIZED CONSTRUCTOR");
	}
	public Exam(String name) {
		this ("JACK",8573598);
		System.out.println("PARAMETERIZED CONSTRUCTOR1:"+name);
	}
	public Exam(String name,int empId) {
		this. savings();
		System.out.println("PARAMETERIZED CONSTRUCTOR2:"+name +empId);
	}
	private void savings() {
		System.out.println("34567690605");
		
	}
	public static void main(String[]args) {
		Exam t = new Exam();
	}

}
