package �Ĵ�;

public class Member implements  Administrator {
	String memberID;
	String pass;
	public Member() {}
	
	Member(String memberID,String pass){
		this.memberID=memberID; this.pass=pass;
		
	}

	@Override
	public String toString() {

		return "";
	}
	public boolean Logon(String memberID, String pass) {
		if(memberID==null && pass=="logout") {
			System.out.println("�α׾ƿ�����");  
		}
		if (memberID.equals(Comp)) {
			System.out.println("�α��μ���");
			return true;
				
		} else {
			System.out.println("�α��ν���");
			System.out.println("ID,PW�� Ȯ���ϼ���");
			return false;
			
		}
	}

	@Override
	public void Logout() { 
		if(memberID==null && pass=="logout") {
			Logon(memberID,pass);  //���ο��� ��ư���������ֱ� 
			System.out.println("�α׾ƿ�����");
			
		}
		
	}

	@Override
	public void menuInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDelete() {
		// TODO Auto-generated method stub
		
	}





}
