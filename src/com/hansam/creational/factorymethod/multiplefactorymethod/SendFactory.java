package com.hansam.creational.factorymethod.multiplefactorymethod;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午2:45:24
 */
public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
