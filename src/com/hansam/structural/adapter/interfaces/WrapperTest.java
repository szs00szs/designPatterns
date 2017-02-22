package com.hansam.structural.adapter.interfaces;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月31日 下午3:07:43
 */
public class WrapperTest {
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}

}
