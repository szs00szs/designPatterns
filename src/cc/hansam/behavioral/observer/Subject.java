package cc.hansam.behavioral.observer;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月6日 下午4:40:16
 */
public interface Subject {

	/* 增加观察者 */
	public void add(Observer observer);

	/* 删除观察者 */
	public void del(Observer observer);

	/* 通知所有的观察者 */
	public void notifyObservers();

	/* 自身的操作 */
	public void operation();
}
