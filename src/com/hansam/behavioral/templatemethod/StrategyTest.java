package com.hansam.behavioral.templatemethod;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午11:28:46
 */
public class StrategyTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}

}
