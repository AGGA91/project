import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Admin_Login extends Frame implements MouseListener {
	Admin_Login() {
		//�� ȸ�� �α��� ���̵�, ��й�ȣ Hash�� ����
		final String id = "admin";
		final String pass = "1234";
		
		
		Frame fr= new Frame();
		fr.setSize(400,600);
		fr.setTitle("������ �α���.");
		fr.setBackground(Color.WHITE);
		fr.setLayout(null);
		
		ImageIcon img = new ImageIcon("Tasty Co.png");
		JLabel j1 = new JLabel(img);
		fr.add(j1);
		j1.setBounds(70,75,250,250);
		
		JTextField jt1 = new JTextField();
		JPasswordField jt2 = new JPasswordField();
		fr.add(jt1);
		fr.add(jt2);
		
		jt1.setSize(180,40);
		jt2.setSize(180,40);
		jt1.setLocation(105,330);
		jt2.setLocation(105,390);
	
		Button b1 = new Button("�α���");
		Label l2 = new Label("�ڷ� ����");
		fr.add(b1);
		fr.add(l2);
		
		b1.setSize(100,40);
		l2.setSize(55,20);
		b1.setLocation(145,450);
		l2.setLocation(30,40);
		//�� ȸ�� ID, ��й�ȣ�� �°� �α����ϸ� �α��� ���� ������ ��� ��  �α��� ���� ������ ���
		
		b1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
//					new Admin_main();
						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
							JOptionPane.showMessageDialog(null, "Tasty ȸ�翡 �α����� �����Ͽ����ϴ�");
							fr.setVisible(false);}
							
						else {JOptionPane.showMessageDialog(null, "���̵� ��й�ȣ�� �����ʽ��ϴ�");
						
						}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		//'�ڷ� ����'���̺� Ŭ���ϸ� Homeâ ���� ����â ����
		l2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				new Home();
				fr.setVisible(false);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		fr.setVisible(true);
		//X������ ��� UI ����
		fr.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
//	 public class MyWinExit extends WindowAdapter {
//	        public void windowClosing(WindowEvent we) {
//	        	dispose();//���� ���� �ִ� â�� ����
//	        	
//			// System.exit(0); // JVM��ü �����Ŵ
//	        }
//	 }

	public static void main(String[] args) {
		
		new Admin_Login();
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}


}
