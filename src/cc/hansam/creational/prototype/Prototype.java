package cc.hansam.creational.prototype;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月30日 下午5:03:14
 */
public class Prototype implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

}
