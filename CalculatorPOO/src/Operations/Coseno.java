package Operations;

public class Coseno extends OperationSingle{

	public Coseno(double operand) {
		super(operand);
	}
	
	public String operate() {
		return Double.toString(Math.cos(Math.toRadians(super.operand)));
	}
	
	public String toString() {
		return "cos(" + operand + ") = " + operate();
	}
}