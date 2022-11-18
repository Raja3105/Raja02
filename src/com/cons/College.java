package com.cons;
public class College {
	public College() {
		this(67687698);
		System.out.println("COLLEGE NAME IS ANURAJA");
	}
	public College(String city) {
		this(47548548, "NO1");
		System.out.println("City is :"+city);
	}
	public College(String owner,int mobile) {
		System.out.println("Owner name is :"+owner+"\n" +mobile);
	}
	public College(int pin , String rank) {
		this("RAAJA", 7585747);
		System.out.println( +pin  +rank);
	}
	public College(int id) {
		this("CHENNAI");
		System.out.println(id);
	}

}
