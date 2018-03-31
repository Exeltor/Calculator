package Operations;

public abstract class OperationSingle {
	
	protected double operand;
	
	public OperationSingle (double operand) {
		this.operand = operand;
	}
	
	public abstract String operate();
	public abstract String toString();
}
