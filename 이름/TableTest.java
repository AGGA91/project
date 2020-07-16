import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

//import MyCom.MyWinExit;
 
public class TableTest extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	
    public TableTest(){
        		
		setTitle("Tasty Co. �Ĵ�ǥ");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 400, 600);
		setSize(400,600);
		contentPane = new JPanel();
		contentPane.setAlignmentY(0.0f);
		contentPane.setAlignmentX(0.0f);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		setResizable(false);
		setLocationRelativeTo(null);
		addWindowListener(new MyWinExit());
		
//------	���
		JPanel HEAD = new JPanel();
		HEAD.setPreferredSize(new Dimension(382,65));
		HEAD.setBackground(new Color(26, 188, 156));
	contentPane.add(HEAD);
			//panel.setBounds(100,100,40,600);
	HEAD.setLayout(null);
	
	JLabel Header = new JLabel("�Ĵ�ǥ");
	Header.setAlignmentX(0.5f);
	Header.setHorizontalAlignment(SwingConstants.CENTER);
	Header.setFont(new Font("���� ���", Font.BOLD, 25));
	//Header.setBackground(Color.WHITE);
	Header.setForeground(Color.WHITE);
	Header.setBounds(125,12,139,34);
	HEAD.add(Header);

	
			//�ڷΰ���***********************�̹����� ��ü�ؼ� ��
//			JLabel back = new JLabel("\u25C0");
//			HEAD.add(back);
//			back.setBounds(10,0,40,40);
//			back.addMouseListener(new MouseListener() {
//				public void mouseClicked(MouseEvent e) {
//					Frame mycom=new MyCom();
//					mycom.setVisible(true);
//			        setVisible(false);
//					
//					
//				}
//				@Override
//				public void mouseReleased(MouseEvent e) {}
//				public void mousePressed(MouseEvent e) {}
//				public void mouseExited(MouseEvent e) {}
//				public void mouseEntered(MouseEvent e) {}			
//				
//			});
		//************************************
	
	
	

		
//------ComNameBox
		JPanel ComNameBox = new JPanel();
		ComNameBox.setPreferredSize(new Dimension(380,40));
	contentPane.add(ComNameBox);
		//ComNameBox.setBounds(100,100,40,600);
		ComNameBox.setBackground(Color.WHITE);
		
	
			JLabel ComName=new JLabel("ȸ��"/*������ ȸ���̸�*/);///�ڡڡڡڡ�
			Font NameFont=new Font(Font.SANS_SERIF,Font.BOLD,15);
			ComNameBox.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
			ComName.setBackground(Color.WHITE);
			ComName.setForeground(Color.BLACK);
				//ComName.setBounds(100,100,50,600);
			ComName.setFont(NameFont);
			ComNameBox.add(ComName);

//------Date		
		JPanel Date = new JPanel();
		Date.setMinimumSize(new Dimension(20, 20));
	contentPane.add(Date);
		Date.setPreferredSize(new Dimension(380,100));
		Date.setBounds(0,0,40,600);
		Date.setBackground(Color.WHITE);
		Date.setLayout(new BorderLayout(0, 0));
		//
		/*JLabel DateWest = new JLabel("����6�� 4�֡���");
		Date.add(DateWest, BorderLayout.WEST);
		DateWest.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
		JLabel DateCenter = new JLabel("7�� 1��");
		DateCenter.setHorizontalAlignment(SwingConstants.CENTER);
		Font CenterDFont=new Font(Font.SANS_SERIF,Font.BOLD,15);
		Date.add(DateCenter, BorderLayout.CENTER);
		DateCenter.setFont(CenterDFont);
		/*
		JLabel DateEast = new JLabel("����7�� 2�֡���");
		Date.add(DateEast, BorderLayout.EAST);
		DateEast.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
//------MealList
		
		 String []a = {"��","ȭ","��","��","��"};
	        String [][]b = {{"a1","a2","a3","a4","a5"},
	                        {"b1","b2","b3","b4","b5"},
	                        {"c1","c2","c3"}};
	        
	        //1. �𵨰� �����͸� ����
	        DefaultTableModel model = new DefaultTableModel(b,a);
	        
	        JPanel p=new JPanel();     
	        //2. Model�� �Ű������� ����, new JTable(b,a)�� ���������� 
	        //���� ������ �ϱ� ���� �ش� ����� ����մϴ�
	        JTable table = new JTable(model); //
	        table.setPreferredSize(new Dimension(380,500));
	        //3. ��������δ� JScrollPane�� �߰��մϴ�.
	        JScrollPane sc = new JScrollPane(table);
	        sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	        sc.setPreferredSize(new Dimension(380,300));
	        
	        //4. ������Ʈ��  Table �߰�
	        p.add(sc);
	        
	        //���̺� ������ �߰��ϱ�
	        //���������͸� �ǵ��� �ʰ� table�� �Ű������� model�� �ִ� �����͸� �����մϴ�
	        DefaultTableModel m =
	                (DefaultTableModel)table.getModel();
	        //�𵨿� ������ �߰� , 1��° �⿡ ���ο� �����͸� �߰��մϴ�
	        m.insertRow(1, new Object[]{"d1","d2","d3"});
	        //�߰��� ��ġ�� ������ ������ �˸��ϴ�.
	        table.updateUI();
	        table.setGridColor(Color.WHITE);
	        table.setGridColor(Color.WHITE);
	        table.setEnabled(false);
	        //table.getTableHeader().setReorderingAllowed(false);
	        table.getTableHeader().setEnabled(false);
	        
    		//�ڷΰ���	    		
    		JLabel back_lb = new JLabel("");
    		back_lb.setIcon(new ImageIcon("�ڷΰ���5.PNG"));
    		back_lb.setBounds(12, 13, 47, 40);
    		back_lb.addMouseListener(new MouseListener() {
    			public void mouseClicked(MouseEvent e) {
    			// TODO Auto-generated method stub
    				new MyCom();
    				setVisible(false);
    			}
    			@Override
    			public void mouseReleased(MouseEvent e) {}
    			
    			@Override
    			public void mousePressed(MouseEvent e) {}
    			
    			@Override
    			public void mouseExited(MouseEvent e) {
    				back_lb.setIcon(new ImageIcon("�ڷΰ���5.PNG"));
    			}
    			
    			@Override
    			public void mouseEntered(MouseEvent e) {
    				back_lb.setIcon(new ImageIcon("�ڷΰ���5_¦.PNG"));
    			}
    			
    	});
    		    		
    		HEAD.add(back_lb);
    		
    		//Ȩ���� ����
    		JLabel home_lb = new JLabel("");
    		home_lb.setIcon(new ImageIcon("Ȩ��ư.PNG"));
    		home_lb.setBounds(330, 13, 42, 40);
    		home_lb.addMouseListener(new MouseListener() {
    			public void mouseClicked(MouseEvent e) {
    			// TODO Auto-generated method stub
    				new Home();
    				//setVisible(true);
    				setVisible(false);
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
    				home_lb.setIcon(new ImageIcon("Ȩ��ư.PNG"));
    			}
    			
    			@Override
    			public void mouseEntered(MouseEvent e) {
    				// TODO Auto-generated method stub
    				home_lb.setIcon(new ImageIcon("Ȩ��ư_¦.PNG"));
    			}
    			
    	});
    		HEAD.add(home_lb);
	        
	        
	        
	        
	 contentPane.add(p);
	        //setBounds(0, 0, 300, 150);
	 contentPane.setVisible(true);
		
	}
    
    public class MyWinExit extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
        	dispose();//���� ���� �ִ� â�� ����
        	//System.exit(0); //JVM��ü �����Ŵ
        }
        
 
 }
    
    public static void main(String[] args) {
		new TableTest();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest frame = new TableTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

