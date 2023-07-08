package service;

import jakarta.xml.ws.Endpoint;

public class PeopleManagementPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/people", new PeopleManagement());
	}

}
