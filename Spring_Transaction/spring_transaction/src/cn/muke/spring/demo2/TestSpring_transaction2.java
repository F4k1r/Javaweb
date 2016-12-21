package cn.muke.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.muke.spring.demo2.AccountService;

/*
 * Spring����ʽ�������ʽһ�Ĳ�����
 * */
public class TestSpring_transaction2 {

	@Test
	public void testIt(){
		
		
		//����һ��IOC����	
		ClassPathXmlApplicationContext context2=new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		//classpath:applicationContext.xml��Ҫ�������ļ�һ��
						
		//ͨ��IOC���������Ӧ����
		//ע�������accountServiceProxy����Ϊ�������������ǿ
		AccountService accountService = (AccountService) context2.getBean("accountServiceProxy");
		accountService.transfer("aaa", "bbb", 200d);
	}
}
