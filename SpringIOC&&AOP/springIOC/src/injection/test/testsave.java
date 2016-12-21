package injection.test;

import injection.service.InjectionService;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import schema.advice.biz.AspectBiz;

public class testsave {

	@Test
	public void testIt(){
		
		//����һ��IOC����	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//classpath:applicationContext.xml��Ҫ�������ļ�һ��
		
		//ͨ��IOC���������Ӧ����
        InjectionService injectionService = (InjectionService) context.getBean("injectionService");
        injectionService.save("ppppp");
        
        InjectionService injectionService1 = (InjectionService) context.getBean("injectionService");
        injectionService1.save("ppppp");
  
        context.close();//�ر�IOC����
        context.destroy();
	}
	
	@Test
	public void testBiz(){
		//����һ��IOC����	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//classpath:applicationContext.xml��Ҫ�������ļ�һ��
				
		//ͨ��IOC���������Ӧ����
		AspectBiz biz = (AspectBiz) context.getBean("aspectBiz");
		biz.biz();
		/*�����
		Bean starts now!
		This is before
		AspectBiz.biz
		Bean ends now!
		*/
		context.close();
	}
}
