package com.hansam.behavioral.memento;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午5:01:52
 */
public class Test {
	public static void main(String[] args) {

		// 创建原始类
		Original origi = new Original("egg");

		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		origi.setValue("niu");
		System.out.println("修改后的状态为：" + origi.getValue());

		// 回复原始类的状态
		origi.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getValue());
	}
}
