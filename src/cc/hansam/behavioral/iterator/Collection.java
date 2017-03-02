package cc.hansam.behavioral.iterator;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月6日 下午5:09:56
 */
public interface Collection {

	public Iterator iterator();

	/* 取得集合元素 */
	public Object get(int i);

	/* 取得集合大小 */
	public int size();
}
