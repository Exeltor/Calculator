package Operations;

public abstract class OperationDouble {
	
	protected double operand1, operand2;
	
	public OperationDouble(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public abstract String operate(); 

}
