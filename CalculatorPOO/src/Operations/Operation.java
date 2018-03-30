package Operations;

public abstract class Operation {
	
	protected double operand1, operand2;
	
	public Operation(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public abstract String operate(); 

}
