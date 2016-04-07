package Calculator;

public class InputHandler {
	private String userString;
	
	public String getUserString() {
		return this.userString;
	}
	
	public void setUserString( String input ) {
		this.userString = input;
	}
	
	public double getFirstNumber() {
		String[] numberArr;
		String userStr = this.getUserString();
		char operator  = this.getOperator();
		
		numberArr = userStr.split( "\\" + Character.toString(operator) );
		
		return Double.parseDouble( numberArr[0] );
	}
	
	public double getSecondNumber() {
		String[] numberArr;
		String userStr = this.getUserString();
		char operator  = this.getOperator();
		
		numberArr = userStr.split( "\\" + Character.toString(operator) );
		
		return Double.parseDouble( numberArr[1] );
	}
	
	public char getOperator() {
		char operator = ' ';
		String userStr = this.getUserString();
		String[] operatorArr = { "+", "*", "-", "/", "%" };
		
		for( String op: operatorArr ) {
			if( userStr.contains(op)) {
				operator = op.charAt(0);
				break;
			}
		}
		return operator;
	}	
}