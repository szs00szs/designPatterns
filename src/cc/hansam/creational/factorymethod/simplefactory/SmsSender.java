package cc.hansam.creational.factorymethod.simplefactory;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午2:43:01
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}
}
