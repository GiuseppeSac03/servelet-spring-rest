package service;

import java.util.ArrayList;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class Calculator {
	
	@WebMethod
	public int somma(List<Integer> nums) {
		int somma = 0;
		
		for(int i = 0; i<nums.size(); i++) {	
			somma = somma + nums.get(i);
		}
		
		return somma;
		
		
	}
	
	@WebMethod
	public double potenza(int num,int num2) {
		
		return Math.pow(num,num2);
	}
	
	@WebMethod
	public double quadrato(int num) {
		return Math.sqrt(num);
	}
	
	@WebMethod
	public double divisione(int num1, int num2) {
		return num1 / (double) num2;
	}
	
	
	
	
	
}
