package factory;

public class OperationDiv extends Operation {

	/**
	 * @author KLP
	 *
	 */
	@Override
	public double getResult() {
		if (getmNumberB() == 0) {
			try {
				throw new Exception("the div number can't be zero .");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		double result = getmNumberA() / getmNumberB();
		return result;
	}

}
