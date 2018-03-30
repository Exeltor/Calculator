package Operations;

public class Log extends Operation{
	
	public Log( double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.log(super.operand1) / Math.log(super.operand2);
		return Double.toString(operation);
	}
}
