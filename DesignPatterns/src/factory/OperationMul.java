package factory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = getmNumberA() * getmNumberB();
		return result;
	}

}
