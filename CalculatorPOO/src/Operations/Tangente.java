package Operations;

public class Tangente extends Operation{

	public Tangente(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.tan(Math.toRadians(super.operand2));
		return Double.toString(operation);
	}
}
