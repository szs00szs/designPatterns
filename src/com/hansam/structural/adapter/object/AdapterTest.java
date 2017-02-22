package com.hansam.structural.adapter.object;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月31日 下午2:37:09
 */
public class AdapterTest {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}

}
