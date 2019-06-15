package ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080/calculator/wsdl")
public interface CalculatorWs {

    public int sum(int add1, int add2);

    public int multiply(int mul1, int mul2);
}