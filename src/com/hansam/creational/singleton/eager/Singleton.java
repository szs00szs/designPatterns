package com.hansam.creational.singleton.eager;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月30日 下午4:25:14
 */

// 饿汉单例模式
// 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快

public class Singleton {
	// 私有构造函数
	private Singleton() {
	}

	// 静态私有成员，已初始化
	private static Singleton single = new Singleton();

	// 静态工厂方法
	public static Singleton getInstance() {
		return single;
	}
}
