package com.hansam.structural.adapter.object;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月31日 下午2:34:53
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
