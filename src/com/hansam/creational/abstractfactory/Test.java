package com.hansam.creational.abstractfactory;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午5:06:58
 */
public class Test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();

		Sender sender = provider.produce();

		sender.send();
	}

}
