package Operations;

public class solveForOperator {
	
	private String operator, side1, side2, history;
	private double side1d, side2d;
	
	public solveForOperator(String operator, String side1, String side2) {
		this.operator = operator;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public String solve() {
		side1d = Double.parseDouble(side1);
		side2d = Double.parseDouble(side2);
		
		if (this.operator.equals("+")) {
			OperationDouble sum = new Sum(side1d, side2d);
			history = sum.toString();
			return sum.operate();
		} else if (this.operator.equals("-")) {
			OperationDouble subtract = new Subtract(side1d, side2d);
			history = subtract.toString();
			return subtract.operate();
		} else if (this.operator.equals("*")) {
			OperationDouble multiply = new Multiply(side1d, side2d);
			history = multiply.toString();
			return multiply.operate();
		} else if (this.operator.equals("/")) {
			OperationDouble divide = new Divide(side1d, side2d);
			history = divide.toString();
			return divide.operate();
		} else if (this.operator.equals("^")) {
			OperationDouble power = new Power(side1d, side2d);
			history = power.toString();
			return power.operate();
		} else if (this.operator.equals("\\u221A")) {
			OperationDouble root = new Root(side1d, side2d);
			history = root.toString();
			return root.operate();
		} else if (this.operator.equals("Log")) {
			OperationDouble log = new Log(side1d, side2d);
			history = log.toString();
			return log.operate();
		} else if (this.operator.equals("sn")) {
			OperationSingle sn = new Seno(side2d);
			history = sn.toString();
			return sn.operate();
		} else if (this.operator.equals("cs")) {
			OperationSingle cs = new Coseno(side2d);
			history = cs.toString();
			return cs.operate();
		} else if (this.operator.equals("tn")) {
			OperationSingle tn = new Tangente(side2d);
			history = tn.toString();
			return tn.operate();
		}
		
		history = side1;
		return side1;
	}
	
	public String toString() {
		return history;
	}

}
