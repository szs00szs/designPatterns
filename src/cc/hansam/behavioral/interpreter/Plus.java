package cc.hansam.behavioral.interpreter;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月8日 上午11:50:56
 */

public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}
}
