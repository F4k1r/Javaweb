package schema.advice;

//Ϊ������
public class MoocAspect {
	public void before(){
		System.out.println("This is pointcut before");
	}
	
	public void afterReturning(){   //�ڷ�������֮�󣬼�ִ����ָ���߼�����С�
		System.out.println("This is pointcut afterReturning");
	}
	
	public void after(){
		System.out.println("after() is done finally");
	}
}
