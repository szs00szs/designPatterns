package com.hansam.behavioral.chain_of_responsibility;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午4:11:33
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + "deal!");

		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
