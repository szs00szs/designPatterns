package com.hansam.structural.decorator;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月31日 下午3:18:53
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}
