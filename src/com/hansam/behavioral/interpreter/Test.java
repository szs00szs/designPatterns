package com.hansam.behavioral.interpreter;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月8日 上午11:51:35
 */
public class Test {
	public static void main(String[] args) {

		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
