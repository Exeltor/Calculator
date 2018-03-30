package Operations;

public class Power extends OperationDouble{

	public Power(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.pow(operand1, operand2);
		return Double.toString(operation);
	}

}
