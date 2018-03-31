package Operations;

public class Seno extends OperationSingle{

	public Seno(double operand) {
		super(operand);
	}

	public String operate() {
		return Double.toString(Math.sin(Math.toRadians(super.operand)));
	}
	
	public String toString() {
		return "sen(" + operand + ") = " + operate();
	}
}