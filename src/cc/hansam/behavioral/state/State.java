package cc.hansam.behavioral.state;

/**
* @author 时帅帅 945210972@qq.com
* @version 创建时间：2016年9月7日 下午6:03:31
*/
/**
 * 状态类的核心类
 */
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the first opt!");
	}

	public void method2() {
		System.out.println("execute the second opt!");
	}
}
