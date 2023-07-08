package service;

import java.util.Arrays;
import java.util.List;

import bean.Person;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class PeopleManagement {
	
	@WebMethod
	public List<Person> getPeople(){
		return Arrays.asList(new Person("Paolo",23), new Person("Mario",21));
	}
}
