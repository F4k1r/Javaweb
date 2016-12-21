package cn.muke.spring.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.muke.spring.demo4.AccountService;

/*
 * Spring��������ʽ��������ע����������ʽ
 * */
public class TestSpring_transaction4 {

	@Test
	public void TestIt(){
		//����һ��IOC����	
		ClassPathXmlApplicationContext context4 =new ClassPathXmlApplicationContext("classpath:applicationContext4.xml");
		//classpath:applicationContext4.xml��Ҫ�������ļ�һ��
										
		//ͨ��IOC���������Ӧ����
		AccountService accountService = (AccountService) context4.getBean("accountService");
		accountService.transfer("aaa", "bbb", 300d);
	}
}
