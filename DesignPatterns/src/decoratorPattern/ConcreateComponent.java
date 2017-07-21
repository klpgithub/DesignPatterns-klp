package decoratorPattern;

/**
 * 具体的装饰对象，起到给Component添加职责
 * 
 * @author KLP
 *
 */
public class ConcreateComponent extends Component {

	@Override
	public void Operation() {
		System.out.println("具体对象的操作...");
	}

}
