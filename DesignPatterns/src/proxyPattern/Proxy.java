package proxyPattern;

/**
 * 代理类，保存一个引用使得代理可以访问实体。并提供一个与Subject的接口相同的接口，这样就可以用代理来代替实体。
 * @author KLP
 *
 */
public class Proxy extends Subject {

	private RealSubject subject;

	@Override
	public void request() {
		if (subject == null) {
			subject = new RealSubject();
		}
		subject.request();
	}

}
