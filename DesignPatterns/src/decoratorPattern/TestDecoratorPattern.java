package decoratorPattern;

public class TestDecoratorPattern {

	public static void main(String[] args) {

		ConcreateComponent concreateComponent = new ConcreateComponent();
		ConcreateDecoratorA decoratorA = new ConcreateDecoratorA();
		ConcreateDecoratorB decoratorB = new ConcreateDecoratorB();

		decoratorA.setmComponent(concreateComponent);
		decoratorB.setmComponent(decoratorA);
		decoratorB.Operation();

	}

}
