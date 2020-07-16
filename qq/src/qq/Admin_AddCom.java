package qq;
//회사 등록

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Admin_AddCom {
	Admin_AddCom() {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		Container c = f.getContentPane();
		c.setBackground(Color.WHITE);
		
		JPanel p1 = new JPanel();
		p1.setSize(400, 90);
		p1.setBackground(new Color(26, 188, 156));
		
		JTextField jf1 = new JTextField();
		JTextField jf2 = new JTextField();
		JTextField jf3 = new JTextField();
		JButton btn1 = new JButton("등록하기");
		ImageIcon backIcon = new ImageIcon("C:/Users/soldesk/Desktop/back.png");
		ImageIcon homeIcon = new ImageIcon("C:/Users/soldesk/Desktop/home.png");
		JButton btn2 = new JButton(backIcon);
		JButton btn3 = new JButton(homeIcon);
		

		JLabel l3 = new JLabel("Company");
		JLabel l4 = new JLabel("회사 등록");
		JLabel l5 = new JLabel("회사명");
		JLabel l6 = new JLabel("회사종류");
		JLabel l7 = new JLabel("회사위치");
		
		btn2.setBounds(12, 20, 70, 48);
		btn3.setBounds(300, 20, 70, 48);
		
		l5.setBounds(50, 120, 100, 35);
		jf1.setBounds(50, 150, 280, 35);
		
		l6.setBounds(50, 210, 100, 35);
		jf2.setBounds(50, 240, 280, 35);
		
		l7.setBounds(50, 300, 100, 35);
		jf3.setBounds(50, 330, 280, 35);
		
		btn1.setBounds(160, 460, 90, 40);
		l3.setBounds(175, 510, 90, 40);
		l4.setBounds(140, 25, 150, 40);
		l4.setFont(new Font("HY견고딕", Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(jf1);
		f.add(jf2);
		f.add(jf3);
		f.add(l3);
		f.add(l4);
		f.add(p1);
		f.setLayout(null);
		f.setVisible(true);
		
		
		//등록하기 
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(jf1.getText().equals("")||jf2.getText().equals("")||jf3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력이 되지 않았습니다.");
					return;
				}else {
					JOptionPane.showMessageDialog(null, "등록되었습니다.");
				}
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Alter();
				f.setVisible(false);
			}
			 
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Main();
				f.setVisible(false);
			}
			 
		});
	}

	public static void main(String[] args) {
		new Admin_AddCom();
	}

}
