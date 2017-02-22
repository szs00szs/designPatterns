package com.hansam.structural.proxy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午12:00:44
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();

	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();

	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}

}
