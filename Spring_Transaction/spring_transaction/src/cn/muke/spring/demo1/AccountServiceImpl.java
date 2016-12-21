package cn.muke.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/*
 * ת��ҵ���߼�ʵ����
 * */
public class AccountServiceImpl implements AccountService {

	//ע��ת��DAOʵ����Ľӿ�
	private AccountDAO accountDAO;
	
    public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
    
    //ע����������ģ��
    private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	/**
     * @param out     :ת���ʺ�
     * @param in      :ת���ʺ�
     * @param money   :ת�˽��
     * */
	@Override
	public void transfer(final String out, final String in, final Double money) {
		
		/*accountDAO.outMoney(out, money);
		int i = 1/0;  //������ִ�д���ʹ��aaa��Ǯת���ˣ�����bbb��Ǯû�����ӣ�
		accountDAO.inMoney(in, money);
		*/
		
		
		
		/*
		 * ���ʽ���������
		 * ���ڣ�ת������ת����Ҫôһ��ɹ���Ҫôһ��ʧ�ܡ�
		 * */
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDAO.outMoney(out, money);
				int i = 1/0;  
				accountDAO.inMoney(in, money);
				
			}
		});
	}

}
