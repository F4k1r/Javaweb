package cn.muke.spring.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.muke.spring.demo3.AccountService;

/*
 * Spring�����������ʽ��������AspectJ��XML���õ�����
 * */
public class TestSpring_transaction3 {

	@Test
	public void TestIt(){
		//����һ��IOC����	
		ClassPathXmlApplicationContext context3 =new ClassPathXmlApplicationContext("classpath:applicationContext3.xml");
		//classpath:applicationContext3.xml��Ҫ�������ļ�һ��
								
		//ͨ��IOC���������Ӧ����
		AccountService accountService = (AccountService) context3.getBean("accountService");
		accountService.transfer("aaa", "bbb", 200d);
	}
}
