package cn.muke.spring.demo2;
/*
 * ת��ҵ���߼��ӿ�
 * */
public interface AccountService {

    /**
     * @param out     :ת���ʺ�
     * @param in      :ת���ʺ�
     * @param money   :ת�˽��
     * */
	public void transfer(String out,String in,Double money);
}
