package decoratorPattern;

public class ConcreateDecoratorB extends Decorator {

	@Override
	public void Operation() {
		super.Operation();
		addedBehaivor();
	}

	// 用来区分ConcreateDecoratorA
	private void addedBehaivor() {
		System.out.println("ConcreateDecoratorB added behaivor !!!");
	}

}
