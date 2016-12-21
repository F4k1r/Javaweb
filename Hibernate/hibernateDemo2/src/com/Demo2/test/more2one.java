package com.Demo2.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Demo2.bean.Grade;
import com.Demo2.bean2.Student;

public class more2one {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init(){
		//�������ö���
		Configuration config = new Configuration().configure();
		//��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//�����Ự��������
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		//�Ự����
		session = sessionFactory.openSession();
		//��������
		transaction = session.beginTransaction();
	}
	
	
	@After
	public void destory(){
		transaction.commit(); //�ύ����
		session.close(); //�رջỰ�������ͷſ��ܵ������ݿ����ӳ����
		sessionFactory.close(); //�رջỰ����	
	}
	/*
	 * �����򣩶��һ������ϵ
	 * */
	@Test
	public void save(){
		
		Grade g = new Grade("Java����","Java��վ��������");
		Student stu1 = new Student("Russell.H","��");
		Student stu2 = new Student("��ǧ�ÿ�","Ů");
		
		stu1.setGrade(g);    /*��ѧ�����ࣩ����༶��һ���У�����*/
		stu2.setGrade(g);
		
		session.save(g);
		session.save(stu1);
		session.save(stu2);
	}
	
	@Test
	public void getGradeByStudent(){
		
		Student stu = (Student)session.get(Student.class, 32);
		System.out.println("ѧ��������"+stu.getSname()+"   �Ա�"+stu.getSex());
		
		Grade g = stu.getGrade();   //���һ������ϵ
		System.out.println("���ڰ༶��"+g.getGname());
		
	}
}
