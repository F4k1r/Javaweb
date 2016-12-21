package cn.muke.spring.demo1;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring_transaction {


	@Test
	public void testIt(){
		//����һ��IOC����	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//classpath:applicationContext.xml��Ҫ�������ļ�һ��
				
		//ͨ��IOC���������Ӧ����
		AccountService accountService = (AccountService) context.getBean("accountService");
		accountService.transfer("aaa", "bbb", 200d);
		        
	}
}
