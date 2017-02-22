package com.hansam.behavioral.strategy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午10:16:52
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}
	
	public static void main(String[] args) {
		 String aString = "2+4";
		 Multiply multiply = new Multiply();
		 int[] split = multiply.split(aString, "\\+");
		 System.out.println(split[0]+split[1]);
	}

}
