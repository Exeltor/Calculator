package Operations;

public class Tangente extends OperationSingle{

	public Tangente(double operand) {
		super(operand);
	}
	
	public String operate() {
		return Double.toString(Math.tan(Math.toRadians(super.operand)));
	}
	
	public String toString() {
		return "tg(" + operand + ") = " + operate();
	}
}