package Calculator;

public interface Operation {
	public double operationResult( double firstNumber, double secondNumber );
}

class Addition implements Operation {
	public double operationResult( double firstN, double secondN ) {
		return firstN + secondN;
	}
}

class Multiplication implements Operation {
	public double operationResult( double firstN, double secondN ) {
		return firstN * secondN;
	}
}

class Division implements Operation {
	public double operationResult( double firstN, double secondN ) {
		return firstN/secondN;
	}
}


class Subtraction implements Operation {
	public double operationResult( double firstN, double secondN ) {
		return firstN - secondN;
	}
}

class Modulus implements Operation {
	public double operationResult( double firstN, double secondN ) {
		return firstN % secondN;
	}
}