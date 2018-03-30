package Operations;

public class Seno extends Operation{

	public Seno(double operand1, double operand2) {
		super(operand1, operand2);
	}

	public String operate() {
		double operation = Math.sin(Math.toRadians(super.operand2));
		return Double.toString(operation);
	}

}
