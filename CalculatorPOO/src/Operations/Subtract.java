package Operations;

public class Subtract extends OperationDouble{

	public Subtract(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = super.operand1 - super.operand2;
		return Double.toString(operation);
	}

}
