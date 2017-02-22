package com.hansam.behavioral.iterator;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月6日 下午5:15:35
 */
public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
