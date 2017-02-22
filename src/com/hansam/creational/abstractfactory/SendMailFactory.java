package com.hansam.creational.abstractfactory;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月28日 下午5:05:14
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
