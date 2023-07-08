package service;

public class CalculatorProxy implements service.Calculator {
  private String _endpoint = null;
  private service.Calculator calculator = null;
  
  public CalculatorProxy() {
    _initCalculatorProxy();
  }
  
  public CalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorProxy();
  }
  
  private void _initCalculatorProxy() {
    try {
      calculator = (new service.CalculatorServiceLocator()).getCalculatorPort();
      if (calculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculator != null)
      ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.Calculator getCalculator() {
    if (calculator == null)
      _initCalculatorProxy();
    return calculator;
  }
  
  public int somma(int[] arg0) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.somma(arg0);
  }
  
  public double potenza(int arg0, int arg1) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.potenza(arg0, arg1);
  }
  
  public double quadrato(int arg0) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.quadrato(arg0);
  }
  
  public double divisione(int arg0, int arg1) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.divisione(arg0, arg1);
  }
  
  
}