package cc.hansam.creational.builder;

import java.util.ArrayList;
/**
* @author 时帅帅 945210972@qq.com
* @version 创建时间：2016年8月29日 上午9:28:54
*/
import java.util.List;

public class Builder {

	private List<Sender> list = new ArrayList<>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

}
