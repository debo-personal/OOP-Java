package Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
	
	private Map<Character, Operation> operations;
	
	public static void main( String[] args ) {
		Calculator calculator = new Calculator();
		calculator.initializeCalcOperations();
		double output = calculator.executeExpression();
		System.out.println( output );
	}

	private void initializeCalcOperations() {
		operations = new HashMap<Character, Operation>();
		operations.put('+', new Addition());
		operations.put('*', new Multiplication());
		operations.put('-', new Subtraction());
		operations.put('/', new Division());
		operations.put('%', new Modulus());
	}
	
	private double executeExpression() {
		double result = 0;
		Scanner scanner = new Scanner( System.in );
		System.out.println("Enter your expression without space like 342+123: ");
		String userString = scanner.nextLine();
		InputHandler ih = new InputHandler();
		ih.setUserString( userString );
		
		Operation operation = operations.get( ih.getOperator() );
		
		double n1 = ih.getFirstNumber();
		double n2 = ih.getSecondNumber();
		if( operation !=null ) {
			result = operation.operationResult(n1, n2);
		}
		else {
			System.out.println("Unknown operator.");
		}
		return result;
	}
}