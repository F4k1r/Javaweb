
package com.hibernate.user;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.*;

import com.demo1.bean.User;
public class UserTest {

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
	@Test
	public void testSaveUser(){     //��
		//�����û�����
		User user = new User("�Ƹ��󿩿�����","123456","1151650717@qq.com","sz",20,"13051189772","no");
		session.save(user); //�������������ݿ�
		
	}
	
	@Test
	public void testGetUser(){    //��
		User user = (User)session.get(User.class,5);
		System.out.println(user.getHeadimg());
	}
	
	@Test
	public void testLoadUser(){    //��
		User user = (User)session.load(User.class,5);
		System.out.println(user.getEmail());
	}
	
	@Test
	public void testUpdateUser(){     //��
		User user = (User)session.get(User.class,5);
		user.setPassword("nolala");
		session.update(user);
	}
	
	@Test
	public void testDeleteUser(){     //ɾ
		User user = (User)session.get(User.class,17);
		session.delete(user);
	}
}
