package Operations;

public class Coseno extends Operation{

	public Coseno(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	public String operate() {
		double operation = Math.cos(Math.toRadians(super.operand2));
		return Double.toString(operation);
	}
}
