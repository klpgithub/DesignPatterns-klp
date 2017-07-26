package decoratorPattern;

/**
 * 装饰抽象类，继承了Component ,从外来类来扩展Component类的功能 
 * 但对于Component来说是不需要知道Decorator的存在的
 * 
 * @author KLP
 *
 */
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
