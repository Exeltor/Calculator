package Operations;

public class Divide extends OperationDouble{

	public Divide(double operand1, double operand2) {
		super(operand1, operand2);
	}

	public String operate() {
		return Double.toString(super.operand1 / super.operand2);
	}
	
	public String toString() {
		return operand1 + " / " + operand2 + " = " + operate();
	}
}