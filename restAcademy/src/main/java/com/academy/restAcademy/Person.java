package com.academy.restAcademy;

import java.util.List;

public class Person {
    private String name;
    private int age;
    
    private List<Person> people;
    
   

    
    public Person() {}
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Person> getPeople() {
	     return people;
	    }
	    
	public void setPeople(List<Person> people) {
	     this.people = people;
	    }
    
    
}
