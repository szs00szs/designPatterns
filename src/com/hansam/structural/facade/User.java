package com.hansam.structural.facade;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午2:37:10
 */
public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
