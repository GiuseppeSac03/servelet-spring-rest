package com.academy.cic;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static List<Person> getDefaultList(){
		List<Person> persons = new ArrayList<Person>();
		Person person1 = new Person("Gianluca",26);
		Person person2 = new Person("Aldo",15);
		Person person3 = new Person("Alma",31);
		Person person4 = new Person("Sandro", 25);
		Person person5 = new Person("Testtesttesttest", 29);
		Person person6 = new Person("Charlie", 17);
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		return persons;
		
	}

}
