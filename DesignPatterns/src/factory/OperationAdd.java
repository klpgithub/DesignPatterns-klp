package factory;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = getmNumberA() + getmNumberB();
		return result;
	}

}
