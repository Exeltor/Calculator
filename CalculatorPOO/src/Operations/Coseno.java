package Operations;

public class Coseno extends OperationSingle{

	public Coseno(double operand) {
		super(operand);
	}
	
	public String operate() {
		double operation = Math.cos(Math.toRadians(super.operand));
		return Double.toString(operation);
	}
	
	public String toString() {
		return "cos(" + operand + ") = " + operate();
	}
}
