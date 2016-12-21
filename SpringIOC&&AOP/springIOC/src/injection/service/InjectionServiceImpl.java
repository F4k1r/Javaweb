package injection.service;

import injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {


	private InjectionDAO injectionDAO;  //����һ����Ա����
	
	//��ֵע��
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	//������ע��
	/*public InjectionServiceImpl(InjectionDAO injectionDAO) {
		super();
		this.injectionDAO = injectionDAO;
	}*/

	public void start(){
		System.out.println("Bean starts now!");
	}
	public void end(){
		System.out.println("Bean ends now!");
	}

	@Override
	public void save(String args) {
		//ģ��ҵ���߼�����
		System.out.println("Service���ղ�����"+args);
		args = args+"��hashCode:"+this.hashCode();
		injectionDAO.save(args);  //IOC�����ڳ�����Ҫʱ�Զ�����ע�봴���˸ö���
	}

}
