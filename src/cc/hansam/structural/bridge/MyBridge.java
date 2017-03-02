package cc.hansam.structural.bridge;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午2:59:43
 */
public class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}

}
