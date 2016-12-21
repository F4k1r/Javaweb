package cn.muke.spring.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	/**
	 * 
	 * @param out   :ת���ʺ�
	 * @param money :ת�����
	 */
	@Override
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money,out);
	}
	
	/**
	 * 
	 * @param in    :ת���ʺ�
	 * @param money :ת����
	 */
	@Override
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money,in);
		
	}

}
