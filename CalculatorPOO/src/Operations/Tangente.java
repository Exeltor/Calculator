package Operations;

public class Tangente extends OperationSingle{

	public Tangente(double operand) {
		super(operand);
	}
	
	public String operate() {
		double operation = Math.tan(Math.toRadians(super.operand));
		return Double.toString(operation);
	}
}
