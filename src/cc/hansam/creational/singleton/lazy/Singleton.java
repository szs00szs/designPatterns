package cc.hansam.creational.singleton.lazy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月29日 下午4:34:01
 */

// 懒汉式单例模式
// 比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
public class Singleton {

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 静态工厂方法，创建实例 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
