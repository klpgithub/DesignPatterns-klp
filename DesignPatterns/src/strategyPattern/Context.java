package strategyPattern;

/**
 * 上下文
 * 
 * @author KLP
 *
 */
public class Context {

	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 上下文接口
	 * 
	 * @author : KLP
	 */
	public void ContextInterface() {
		strategy.algorithmInterface();
	}

}
