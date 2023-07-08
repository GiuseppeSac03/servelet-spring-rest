package application;

import java.awt.List;
import java.rmi.RemoteException;
import java.util.ArrayList;

import service.Calculator;
import service.CalculatorProxy;

public class Application {

	public static void main(String[] args) throws RemoteException {
		CalculatorProxy calculatorProxy = new CalculatorProxy("http://localhost:8080/people");

		
		System.out.println(calculatorProxy.divisione(10, 0));
		System.out.println(calculatorProxy.potenza(2,8));
		System.out.println(calculatorProxy.quadrato(4));
		System.out.println(calculatorProxy.somma(new int[] {10,5,23}));
		
		

	}

}
