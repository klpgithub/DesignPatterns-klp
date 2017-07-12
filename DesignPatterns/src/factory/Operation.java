package factory;

/**
 * 数据运算基类
 * 
 * @author KLP
 *
 */
public class Operation {

	private double mNumberA = 0;
	private double mNumberB = 0;

	public double getmNumberA() {
		return mNumberA;
	}

	public void setmNumberA(double mNumberA) {
		this.mNumberA = mNumberA;
	}

	public double getmNumberB() {
		return mNumberB;
	}

	public void setmNumberB(double mNumberB) {
		this.mNumberB = mNumberB;
	}

	/**
	 * 获取运算结果
	 * 
	 * @author : KLP
	 * @return
	 */
	public double getResult() {
		double result = 0;
		return result;
	}

}
