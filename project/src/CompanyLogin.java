package �Ĵ�;

import java.util.HashMap;

public class CompanyLogin {
String ID;
String PASS;
CompanyLogin(String id, String pass) {
	ID=id;
	PASS=pass;
	
}

	public static void main(String[] args) {
		HashMap<String, CompanyLogin> login=new HashMap<>();
		CompanyLogin ta=new CompanyLogin("Tasty","1234");
		CompanyLogin ju=new CompanyLogin("�ֽ�","1234");
		CompanyLogin mool=new CompanyLogin("����","1234");
		CompanyLogin co=new CompanyLogin("Costca","1234");
		CompanyLogin ri=new CompanyLogin("Riotgames","1234");
		
		login.put("Tasty Co.", ta);
		login.put("(��)�ֽ�", ju);
		login.put("(��)����", mool);
		login.put("Costca", co);
		login.put("Riotgames",ri);
		
		
		if(memberID==null && pass=="logout") {
		System.out.println("�α׾ƿ�����");  
	}
	if (memberID.equals(login.get("Tasty Co.").ID && pass.equals(login.get("Tasty Co.").PASS))) {
		System.out.println("�α��μ���");
		return true;
			
	} else {
		System.out.println("�α��ν���");
		System.out.println("ID,PW�� Ȯ���ϼ���");
		return false;
		
	}
		Member member = new Member();
		member.Logon(login.get("Tasty Co.").ID, login.get("Tasty Co.").PASS);

	}
}
