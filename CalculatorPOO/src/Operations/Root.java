package Operations;

public class Root extends OperationDouble{
	
	public Root(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.pow(operand2, 1 / operand1);
		return Double.toString(operation);
	}
}
