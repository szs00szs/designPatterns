package com.hansam.behavioral.visitor;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午6:29:05
 */
public class Test {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}

}
