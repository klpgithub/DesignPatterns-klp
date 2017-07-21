package decoratorPattern;

public abstract class Decorator extends Component {

	protected Component mComponent;

	public void setmComponent(Component mComponent) {
		this.mComponent = mComponent;
	}

	@Override
	public void Operation() {
		if (mComponent != null) {
			mComponent.Operation();
		}
	}
}
