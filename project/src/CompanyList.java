package �Ĵ�;

import java.util.HashMap;
//ȸ�� ��ϰ� �� �ıǰ��� ����Ʈ
public class CompanyList {
	static HashMap<String, Integer> companymap = new HashMap<String, Integer>();
	public void addcompany(String name, int price) {
		companymap.put(name, price);
	}
	public static void main(String[] args) {
		
		companymap.put("Tasty Co.", 4500);
		companymap.put("(��)�ֽ�", 4000);
		companymap.put("(��)����", 5000);
		companymap.put("Costca", 4500);
		companymap.put("Riotgames", 6000);
	
		
		// ȸ��˻� - ����ǥ����.
		// gui���� ��� �Ͻðڽ��ϱ� ��/�ƴϿ� ���� 
	}
}
