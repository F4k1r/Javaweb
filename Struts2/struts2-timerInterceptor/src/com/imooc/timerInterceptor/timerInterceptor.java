package com.imooc.timerInterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/*
 * ����ִ��Action���ѵ�ʱ��
 * */
public class timerInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//��Actionִ��֮ǰ
		long startTime = System.currentTimeMillis();
		
		//���ж����������ִ����һ�����������������һ��������������Ŀ��Action.
		String result = invocation.invoke();
		
		//ִ��Action֮��
		long endTime = System.currentTimeMillis();
		
		//��̨���
		System.out.println("ִ��Action��ʱ�䣺"+(endTime-startTime)+"ms");
		
		//������ͼ
		return result;
	}

}
