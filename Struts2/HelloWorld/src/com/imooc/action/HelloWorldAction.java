package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {


	
	public String add(){
		System.out.println("ִ��add����");
		return "add";
	}
	
	public String update(){
		System.out.println("ִ��update����");
		return "update";
	}
	
	
	//helloworld.action
	@Override
	public String execute() throws Exception {
		
		System.out.println("ִ��execute����");
		return SUCCESS;
	}

	
}
