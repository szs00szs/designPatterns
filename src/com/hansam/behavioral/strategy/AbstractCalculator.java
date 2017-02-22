package com.hansam.behavioral.strategy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午10:11:07
 */
public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
	

}
