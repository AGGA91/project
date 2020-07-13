import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.*;

class Meal extends Frame implements MouseListener{
	Meal() {
		
		super("Tasty Co. �Ĵ�ǥ");
		
		this.setSize(400,600);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.WHITE);
		MyWinExit end=new MyWinExit();
		this.addWindowListener(new MyWinExit());
		
		Color gren=new Color(26, 188, 156); //���� �÷�
//===================���==================

		Panel MyComHeader=new Panel(); //��� �г� ����
		MyComHeader.setPreferredSize(new Dimension(600,40));//��� ������ ����
		MyComHeader.setBackground(gren);//����� �����÷� ���̱�
		
		Label mycom=new Label("�Ĵ�ǥ");//��� �� ȸ�� ��Ʈ
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,18);//�����Ʈ
		mycom.setForeground(Color.WHITE);//��Ʈ ��������
		mycom.setFont(font);//���ڿ� ��Ʈ ���̱�
		
		MyComHeader.add("center",mycom); //�гο� �� ���̱�
		this.add(MyComHeader);//�����ӿ� �г� ���̱�

//====================================
		
		Panel ComNameBox=new Panel();
		ComNameBox.setPreferredSize(new Dimension(600,40));
		//ȸ���̸� �޼ҵ� �ʿ�
		Label ComName=new Label(/*������ȸ���̸�*/); 
		Font NameFont=new Font(Font.SANS_SERIF,Font.BOLD,15); 
		//ComName �󺧿� ��Ʈ ���̱�
		ComName.setFont(NameFont);
		
	
		//�гο� �� ���̱�
		ComNameBox.add(ComName,"Center"); 
		//�����ӿ� �г� ���̱�
		this.add(ComNameBox);
	
	this.setVisible(true);
	} //Meal() Ŭ���� ����
	
//==================�ݱ�================
		
	
// ������ ���� Ŭ���� MyWinExit
	public class MyWinExit extends WindowAdapter {
	       public void windowClosing(WindowEvent we) {
	        dispose(); //���� ���� �ִ� â�� ����

	        }
	    }
	
	
	//��������ȯ ������
	public void mouseClicked(MouseEvent e) {}

	//����
public static void main(String[] args) {

}

//----------------��������------------------

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}



}//class Meal extends Frame implements MouseListener ����


