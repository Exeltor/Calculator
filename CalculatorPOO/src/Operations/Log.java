package Operations;

public class Log extends OperationDouble{
	
	public Log( double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.log(super.operand2) / Math.log(super.operand1);
		return Double.toString(operation);
	}
}
