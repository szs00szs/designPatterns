package com.hansam.behavioral.chain_of_responsibility;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月7日 下午12:00:03
 */
public class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
