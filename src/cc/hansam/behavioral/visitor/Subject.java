package cc.hansam.behavioral.visitor;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午6:26:07
 */
public interface Subject {
	public void accept(Visitor visitor);

	public String getSubject();
}
