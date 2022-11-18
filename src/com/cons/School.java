package com.cons;

public class School extends College {
	public School() {
		this("CHENNAI");
		System.out.println("SCHOOL NAME IS SOUNDRAJA");
	}
	public School(String city) {
		this(567778);
		System.out.println("City is : "+city);
	}
	public School(String owner,long mobile) {
		System.out.println("Owner name is "+owner + mobile);
	}
	public School(int pin , String rank) {
		this("ANURAJA", 7698479889l);
		System.out.println( +pin  +rank);
	}
	public School(int id) {
		this(54758858, "no2");
		System.out.println(id);
	}
	public static void main(String[]args) {
		School t=new School();
	}
}
