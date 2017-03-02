package cc.hansam.structural.adapter.classes;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年8月31日 下午2:26:22
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
