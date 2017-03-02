package cc.hansam.structural.proxy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 上午11:59:50
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
