package qq;
//���� & �ı����

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Admin_Review {
	 private final Object [] colNames = {"���","����","�Խ���","����"};
	 private Object [][] datas = {{true,"�ż���","������","5.0"},
			 						{false,"�����׿�","�ڻ��","4.0"},
	 								{false,"���� ���� ���ֳ׿�","��Ǿ�","1.0"},
	 								{false,"�� ���̸� �����ѱ׸�","������","2.0"},
			 						{true,"������ ����?","������","3.0"}};
	 
	Admin_Review() {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		Container c = f.getContentPane();
		c.setBackground(Color.WHITE);
		
		JPanel p1 = new JPanel();
		p1.setSize(400, 90);
		p1.setBackground(new Color(26, 188, 156));
		
		JButton btn1 = new JButton("����");
		ImageIcon backIcon = new ImageIcon("C:/Users/soldesk/Desktop/back.png");
		ImageIcon homeIcon = new ImageIcon("C:/Users/soldesk/Desktop/home.png");
		JButton btn2 = new JButton(backIcon);
		JButton btn3 = new JButton(homeIcon);
		JButton btn4 = new JButton("����");
		JButton btn5 = new JButton("����");
		JButton btn6 = new JButton("����");
		JButton btn7 = new JButton("����");
		JButton btn8 = new JButton("����");
		
		JLabel l3 = new JLabel("Company");
		JLabel l4 = new JLabel("���� & �ı����");
		
		btn1.setBounds(160, 400, 90, 40);
		btn2.setBounds(12, 20, 70, 48);
		btn3.setBounds(300, 20, 70, 48);
		
		btn4.setBounds(315, 148, 65, 30);
		btn5.setBounds(315, 186, 65, 30);
		btn6.setBounds(315, 226, 65, 30);
		btn7.setBounds(315, 265, 65, 30);
		btn8.setBounds(315, 304, 65, 30);
		
		l3.setBounds(175, 510, 90, 40);
		l4.setBounds(100, 25, 200, 40);
		l4.setFont(new Font("HY�߰��", Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		
		//üũ�ڽ� JTable
		JPanel p2 = new JPanel(new BorderLayout());
		p2.setBounds(10, 120, 300, 220);
		 DefaultTableModel dtm = new DefaultTableModel(datas, colNames);
		   JTable table = new JTable(dtm);
		   table.getColumn("���").setCellRenderer(dcr);
		   JCheckBox box = new JCheckBox();
		   box.setHorizontalAlignment(JLabel.CENTER);
		   table.getColumn("���").setCellEditor(new DefaultCellEditor(box));
		   JScrollPane jsp = new JScrollPane(table);
		   p2.add(jsp,"Center");
		   table.setRowHeight(40); //���̺� ����������
		   //table.setEnabled(false);
		   table.getTableHeader().setEnabled(false);
		   
		   
//		   DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();//���̺� �� ���� �߾ӿ� ��ġ
//		   centerRenderer.setHorizontalAlignment( JLabel.CENTER );
//		   table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
//		   table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
//		   table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
//		   table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
//		���̺� �� ���� �߾ӿ� ��ġ�ϵ��� CellRenderer�� �ǵ帮�� üũ�ڽ� ǥ�ð� �ƴ� true false�� ����̵ȴ�.
		   
		   table.getColumnModel().getColumn(0).setPreferredWidth(5); //���̺� 0��° ����������
		   table.getColumnModel().getColumn(1).setPreferredWidth(50);
		   table.getColumnModel().getColumn(2).setPreferredWidth(5);
		   table.getColumnModel().getColumn(3).setPreferredWidth(5);
		//
		   
		f.add(p2);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		f.add(btn7);
		f.add(btn8);
		f.add(l3);
		f.add(l4);
		f.add(p1);
		f.setLayout(null);
		f.setVisible(true);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Main();
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
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review_Edit1();
				f.setVisible(false);
			}
			 
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review_Edit2();
				f.setVisible(false);
			}
			 
		});
		
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review_Edit3();
				f.setVisible(false);
			}
			 
		});
		
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review_Edit4();
				f.setVisible(false);
			}
			 
		});
		
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review_Edit5();
				f.setVisible(false);
			}
			 
		});
	}

	
	
	public static void main(String[] args) {
		new Admin_Review();
	}
	
	DefaultTableCellRenderer dcr = new DefaultTableCellRenderer()
	 {
	  public Component getTableCellRendererComponent
	   (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	  {
	   JCheckBox box= new JCheckBox();
	   box.setSelected(((Boolean)value).booleanValue());  
	   box.setHorizontalAlignment(JLabel.CENTER);
	   return box;
	  }
	 };
	}


