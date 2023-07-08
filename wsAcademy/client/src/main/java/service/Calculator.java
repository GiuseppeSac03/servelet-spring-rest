/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface Calculator extends java.rmi.Remote {
    public int somma(int[] arg0) throws java.rmi.RemoteException;
    public double potenza(int arg0, int arg1) throws java.rmi.RemoteException;
    public double quadrato(int arg0) throws java.rmi.RemoteException;
    public double divisione(int arg0, int arg1) throws java.rmi.RemoteException;
}
