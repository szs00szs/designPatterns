package cc.hansam.behavioral.mediator;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月8日 上午11:36:28
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;

	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}
}
