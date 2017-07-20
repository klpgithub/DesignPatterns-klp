package factory;

public class Client {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.createOperation();
		operation.setmNumberA(5);
		operation.setmNumberB(3);
		double result = operation.getResult();
		System.out.println("addition result :" + result);

		operFactory = new SubFactory();
		Operation subOperation = operFactory.createOperation();
		subOperation.setmNumberA(2);
		subOperation.setmNumberB(2);
		result = subOperation.getResult();
		System.out.println("subtraction result : " + result);

		operFactory = new MulFactory();
		Operation mulOperation = operFactory.createOperation();
		mulOperation.setmNumberA(2);
		mulOperation.setmNumberB(1);
		result = mulOperation.getResult();
		System.out.println("multiplication result : " + result);

		operFactory = new DivFactory();
		Operation divOperation = operFactory.createOperation();
		divOperation.setmNumberA(2);
		divOperation.setmNumberB(1);
		result = divOperation.getResult();
		System.out.println("division result : " + result);
	}

}
