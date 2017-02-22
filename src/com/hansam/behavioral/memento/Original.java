package com.hansam.behavioral.memento;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午4:49:13
 */
public class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

}
