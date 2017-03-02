package cc.hansam.behavioral.strategy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午10:14:10
 */
public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

	public static void main(String[] args) {
		String aString = "6/3";
		String[] split = aString.split("/");

		System.out.println(Integer.valueOf(split[0]) / Integer.valueOf(split[1]));
	}

}
