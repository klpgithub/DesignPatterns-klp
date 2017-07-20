package factory;

public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = getmNumberA() - getmNumberB();
		return result;
	}

}
