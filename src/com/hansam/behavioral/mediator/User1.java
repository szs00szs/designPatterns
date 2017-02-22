package com.hansam.behavioral.mediator;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月8日 上午11:29:10
 */
public class User1 extends User {

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}
