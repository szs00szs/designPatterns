package cc.hansam.creational.factorymethod.multiplefactorymethod;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午2:46:46
 */
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();

		Sender sender = factory.produceMail();

		sender.send();
	}

}
