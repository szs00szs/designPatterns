package com.hansam.behavioral.templatemethod;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午11:25:43
 */
public abstract class AbstractCalculator {

	/* 主方法，实现对本类其它方法的调用 */
	public final int calculate(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}

	/* 被子类重写的方法 */
	abstract public int calculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
