import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		// ȭ���߾ӿ��� �߰�, ȭ�� â ũ�� ��ȯ ���ϰ�
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		
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
		jt1.setLocation(118,314);
		jt2.setLocation(118,374);
	
		JLabel lblNewLabel = new JLabel("ID  :");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 15));
		lblNewLabel.setBounds(70, 314, 42, 33);
		fr.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setForeground(Color.GRAY);
		lblPw.setFont(new Font("���� ���", Font.BOLD, 15));
		lblPw.setBounds(70, 373, 36, 41);
		fr.add(lblPw);
		
//		Button b1 = new Button("�α���");
//		Label l2 = new Label("�ڷ� ����");
//		fr.add(b1);
//		fr.add(l2);
//		
//		b1.setSize(100,40);
//		l2.setSize(55,20);
//		b1.setLocation(145,450);
//		l2.setLocation(30,40);
		
		
		
		//�� ȸ�� ID, ��й�ȣ�� �°� �α����ϸ� �α��� ���� ������ ��� ��  �α��� ���� ������ ���
		
//		b1.addMouseListener(new MouseListener() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////					new Admin_main();
//						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
//							JOptionPane.showMessageDialog(null, "�α����� �����Ͽ����ϴ�");
//							fr.setVisible(false);}
//							
//						else {JOptionPane.showMessageDialog(null, "���̵� ��й�ȣ�� �����ʽ��ϴ�");
//						
//						}
//			}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseReleased(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//		});
//		//'�ڷ� ����'���̺� Ŭ���ϸ� Homeâ ���� ����â ����
//		l2.addMouseListener(new MouseListener() {
//			public void mouseClicked(MouseEvent e) {
//				new Home();
//				fr.setVisible(false);
//			}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseReleased(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//		});
		
		//�α��� ��ư ����
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\r\n");
		btnNewButton.setFont(new Font("���� ���", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(147, 443, 97, 33);
		
	
		
		
		
		//�α��� id: admin, pw: 1234�� ���� �� �α��μ���, ���н� �α��� ���� ������ �Բ� ����
		btnNewButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
//					new Admin_main();
						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
							JOptionPane.showMessageDialog(null, "�α����� �����Ͽ����ϴ�");
							fr.setVisible(false);}
							
						else {JOptionPane.showMessageDialog(null, "���̵� ��й�ȣ�� �����ʽ��ϴ�");
						
						}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		
		
		
		fr.add(btnNewButton);
		
		JLabel back_lb = new JLabel("");
		back_lb.setIcon(new ImageIcon("�ڷΰ���5.PNG"));
		back_lb.setBounds(20, 30, 47, 40);
		back_lb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				new Home();
				//setVisible(true);
				fr.setVisible(false);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				back_lb.setIcon(new ImageIcon("�ڷΰ���5.PNG"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				back_lb.setIcon(new ImageIcon("�ڷΰ���5_¦.PNG"));
			}
			
	});
		
		
		fr.add(back_lb);

		
		
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
