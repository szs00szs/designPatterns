package cc.hansam.structural.bridge;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午2:57:43
 */
public abstract class Bridge {
	private Sourceable source;

	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	
	

}
