package Operations;

public class Seno extends OperationSingle{

	public Seno(double operand) {
		super(operand);
	}

	public String operate() {
		double operation = Math.sin(Math.toRadians(super.operand));
		return Double.toString(operation);
	}
	
	public String toString() {
		return "sen(" + operand + ") = " + operate();
	}
}
