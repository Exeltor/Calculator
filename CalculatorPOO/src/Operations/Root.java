package Operations;

public class Root extends OperationDouble{
	
	public Root(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		return Double.toString(Math.pow(operand2, 1 / operand1));
	}

	public String toString() {
		return operand1 + "\u221A" + "(" + operand2 + ") = " + operate();
	}
}