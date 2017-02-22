package com.hansam.creational.factorymethod.simplefactory;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午2:42:18
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mailsender!");
	}

}
