package cc.hansam.behavioral.strategy;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月5日 上午10:16:10
 */
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
