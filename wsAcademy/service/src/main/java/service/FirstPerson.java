package service;


import java.util.ArrayList;
import bean.Person;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class FirstPerson {
	
	@WebMethod
	public Person getFirstPerson(){
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Mario",23));
		persons.add(new Person("Giuseppe",19));
		return persons.get(0);
	}
}
