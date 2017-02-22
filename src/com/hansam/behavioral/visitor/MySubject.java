package com.hansam.behavioral.visitor;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午6:28:20
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
