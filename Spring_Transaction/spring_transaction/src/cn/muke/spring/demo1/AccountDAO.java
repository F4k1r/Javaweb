package cn.muke.spring.demo1;
/*
 * ת��DAO��ӿ�
 * */
public interface AccountDAO {

	/**
	 * 
	 * @param out   :ת���ʺ�
	 * @param money :ת�����
	 */
	public void outMoney(String out,Double money);
	
	/**
	 * 
	 * @param in    :ת���ʺ�
	 * @param money :ת����
	 */
	public void inMoney(String in,Double money);
}
