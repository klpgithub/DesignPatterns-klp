package proxyPattern;

/**
 * 定义Proxy所代表的真实实体
 * @author KLP
 *
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实请求");
	}

}
