package �Ĵ�;

import java.util.ArrayList;

import java.util.List;

public interface Administrator {
	/*
	 * final String ID="admin"; final String pass="admin"; // ������ ���̵�, ��й�ȣ
	 */
	/*
	 * // String[] menu=new String[100]; // ���� ���� �̸� // List<MenuSelect>
	 * menulist=new ArrayList<>(); // �ֹ� ������ �� �ڸ�
	 */	
	
	public boolean Logon(String ID, String pass); // ������ �α׿�
	public void Logout(); // ������ �α׾ƿ�
	
	public void menuInput(); // ���� �Է�
	public void menuDelete(); // ���� ����
	
	public double grade=0.0; // ����,�������̽��� �ʱⰪ �־���մϴ�. ��!

	
}
