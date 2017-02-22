package com.hansam.structural.proxy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午12:03:17
 */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
