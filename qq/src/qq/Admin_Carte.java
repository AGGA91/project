package qq;
//�Ĵ�ǥ ��� ����

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Admin_Carte {
	static String company[] = {"Tasty Co.", "�Ｚ����", "Ȧ������", "���̿������۴�", "�ο����۴�"};
	static String date[] = {"2020�� 7�� 1����", "2020�� 7�� 2����", "2020�� 7�� 3����", "2020�� 7�� 4����"};
	
	Admin_Carte() {
	
	JFrame f = new JFrame();
	f.setSize(400, 600);
	
	Container c = f.getContentPane();
	c.setBackground(Color.WHITE);
	
	JPanel p1 = new JPanel();
	p1.setSize(400, 90);
	p1.setBackground(new Color(26, 188, 156));
	
	JComboBox combo1 = new JComboBox<String>(company);
	JComboBox combo2 = new JComboBox<String>(date);
	JButton btn1 = new JButton("�߰�");
	JButton btn2 = new JButton("����");
	JButton btn3 = new JButton("���");
	JButton btn4 = new JButton("����");
	ImageIcon backIcon = new ImageIcon("C:/Users/soldesk/Desktop/back.png");
	ImageIcon homeIcon = new ImageIcon("C:/Users/soldesk/Desktop/home.png");
	JButton btn5 = new JButton(backIcon);
	JButton btn6 = new JButton(homeIcon);
	
	JLabel l3 = new JLabel("Company");
	JLabel l4 = new JLabel("�Ĵ�ǥ ���/����");
	JLabel l5 = new JLabel("ȸ�� ����");
	
	l5.setBounds(30, 95, 100, 35);
	
	btn5.setBounds(12, 20, 70, 48);
	btn6.setBounds(300, 20, 70, 48);
	
	combo1.setBackground(Color.WHITE);
	combo1.setBounds(30, 125, 325, 35);
	combo2.setBackground(Color.WHITE);
	combo2.setBounds(30, 170, 160, 35);
	
	btn1.setBounds(205, 170, 70, 35);
	btn2.setBounds(285, 170, 70, 35);
	btn3.setBounds(120, 470, 70, 35);
	btn4.setBounds(220, 470, 70, 35);
	l3.setBounds(175, 510, 90, 40);
	l4.setBounds(105, 25, 180, 40);
	l4.setFont(new Font("HY�߰��", Font.BOLD,22));
	l4.setForeground(Color.WHITE);
	
	//���̺�
	JTable table2 = new JTable();
	table2.setBorder(new LineBorder(new Color(0, 0, 0)));
	table2.setModel(new DefaultTableModel(
		new Object[][] {
			{"\uAD6C\uBD84/\uC694\uC77C", "\uC6D4", "\uD654", "\uC218", "\uBAA9", "\uAE08"},
			{"", null, null, null, null, null},
			{"", null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
		},
		new String[] {
			"\uAD6C\uBD84/\uC694\uC77C", "\uC6D4", "\uD654", "\uC218", "\uBAA9", "\uAE08"
		}
	));
	table2.setBounds(30, 220, 326, 200);
	table2.setRowHeight(40);
	f.getContentPane().add(table2);
	

	f.add(btn1);
	f.add(btn2);
	f.add(btn3);
	f.add(btn4);
	f.add(btn5);
	f.add(btn6);
	f.add(l5);
	f.add(combo1);
	f.add(combo2);
	f.add(l3);
	f.add(l4);
	f.add(p1);
	f.setLayout(null);
	f.setVisible(true);
	
	btn5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			new Admin_Main();
			f.setVisible(false);
		}
		 
	});
	
	btn6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			new Admin_Main();
			f.setVisible(false);
		}
		 
	});
}
	
	public static void main(String[] args) {
		new Admin_Carte();
		
	}
}
