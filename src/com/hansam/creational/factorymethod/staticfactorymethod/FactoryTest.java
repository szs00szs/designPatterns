package com.hansam.creational.factorymethod.staticfactorymethod;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午3:05:23
 */
public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();

		sender.send();
	}

}
