package cc.hansam.behavioral.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月6日 下午4:40:46
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);

	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
