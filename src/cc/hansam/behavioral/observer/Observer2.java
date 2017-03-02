package cc.hansam.behavioral.observer;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月6日 下午4:38:53
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}
