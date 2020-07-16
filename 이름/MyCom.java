import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class MyCom extends Frame implements MouseListener{
	final static String a="ȸ�纰 �Ĵ�ǥ";
	
	MyCom(){	
		super("Tasty Co.");
		this.setVisible(true);
		this.setSize(400,600);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.WHITE);
		this.addWindowListener(new MyWinExit());
		//���������� â �ø���, ���̱� �Ұ���. ȭ�鰡��� â�̶߰�
		setResizable(false);
		setLocationRelativeTo(null);

		

		//===================���==================
		Color gren=new Color(26, 188, 156); //���� �÷�
		
		Panel MyComHeader=new Panel(); //��� �г� ����
		MyComHeader.setPreferredSize(new Dimension(382,65));//��� ������ ����
		MyComHeader.setBackground(gren);//����� �����÷� ���̱�
		MyComHeader.setLayout(null);
		
		//************�� ȸ�� �۾�*************
		Label mycom=new Label(a);//��� �� ȸ�� ��Ʈ
		Font font=new Font("���� ���",Font.BOLD,25);//�����Ʈ
		mycom.setForeground(Color.WHITE);//��Ʈ ��������
		mycom.setFont(font);//���ڿ� ��Ʈ ���̱�
		mycom.setBounds(110,17,168,34);
		MyComHeader.add("center",mycom); //�гο� �� ���̱�
		this.add(MyComHeader);//�����ӿ� �г� ���̱�
		
	
		
		
		
//����ڷΰ���****************�̹����� ��ü*********************
//		JLabel back = new JLabel("\u25C0      ");
//		MyComHeader.add(back, BorderLayout.WEST);
//		back.addMouseListener(new MouseListener() {
//			public void mouseClicked(MouseEvent e) {
//				Frame mycom=new CustMain(); //�ڡڡڡڡ�
//				mycom.setVisible(true);  // Ȩ���� ���� ����
//		        setVisible(false);		 //
//			}
//			@Override
//			public void mouseReleased(MouseEvent e) {}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}			
//			
//		});
		
		
		
		
		
		
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
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {
				home_lb.setIcon(new ImageIcon("Ȩ��ư.PNG"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				home_lb.setIcon(new ImageIcon("Ȩ��ư_¦.PNG"));
			}
	});
		MyComHeader.add(home_lb);
		
		
		
		//�ڷΰ���
		JLabel back_lb = new JLabel("");
		back_lb.setIcon(new ImageIcon("�ڷΰ���5.PNG"));
		back_lb.setBounds(12, 13, 47, 40);
		back_lb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				JFrame mycom = new CustMain();
				mycom.setVisible(true);
				//setVisible(true);
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
						MyComHeader.add(back_lb);
		
		
	
		

		
		
		

//====================================

		Button select1=new Button("����");
		Button select2=new Button("����");
		Button select3=new Button("����");
		Button select4=new Button("����");
		Button select5=new Button("����");//���ù�ư

		
//---------------ȸ�縮��Ʈ-----------
		Panel List=new Panel();
		List.setLayout(new GridLayout(0,4));
		
		
		Label Number=new Label("No.");
			Label company=new Label("ȸ�� �̸�");
			Label ticketCost=new Label("�ı� ����");
			Label select=new Label("����");
		Font listT=new Font(Font.SANS_SERIF,Font.BOLD,15);
		Number.setFont(listT);
		company.setFont(listT);
		ticketCost.setFont(listT);
		select.setFont(listT);
		
//--------��ü����-----------		
		List.add(Number,"Center");
		List.add(company,"Center");		
		List.add(ticketCost,"Center");
		List.add(select,"Right");
		
		Label Company1=new Label("Tasty Co,");
		Label Company2=new Label("(��)�ֽ�");
		Label Company3=new Label("(��)����");
		Label Company4=new Label("Costca");
		Label Company5=new Label("Riotgamas");
		
			Label Cost1=new Label("4,500");
			Label Cost2=new Label("4,000");
			Label Cost3=new Label("5,000");
			Label Cost4=new Label("4,500");
			Label Cost5=new Label("6,000");
			
		Label Num1=new Label("1");Label Num2=new Label("2"); Label Num3=new Label("3");
		Label Num4=new Label("4");Label Num5=new Label("5");

//-----------List�� ��ü�ֱ�-----------
		List.add(Num1,"Center");List.add(Company1,"Center");
		List.add(Cost1,"Center"); List.add(select1,"Center");
		
		List.add(Num2,"Center");List.add(Company2,"Center");
		List.add(Cost2,"Center"); List.add(select2,"Center");
		
		List.add(Num3,"Center");List.add(Company3,"Center");
		List.add(Cost3,"Center"); List.add(select3,"Center");
		
		List.add(Num4,"Center");List.add(Company4,"Center");
		List.add(Cost4,"Center"); List.add(select4,"Center");
		
		List.add(Num5,"Center");List.add(Company5,"Center");
		List.add(Cost5,"Center"); List.add(select5,"Center");
//-------�����ӿ� List�ֱ�------	

		this.add(List);
		
		this.setVisible(true);
		
//----��ư�� ��������ȯ�̺�Ʈ�ֱ�
	select1.addMouseListener(this);
	select2.addMouseListener(this);
	select3.addMouseListener(this);
	select4.addMouseListener(this);
	select5.addMouseListener(this);
	}
	//������ ��ȯ Ŭ����
	 public void mouseClicked(MouseEvent e) {      
	       // new Proj();
	        JFrame tabletest=new TableTest(); //JFrame���� Frame���� �̵�
		 				  //Frame ȣ���ؼ� �̵�
	        tabletest.setVisible(true);	  //TableTest ����
	        setVisible(false);		  //MyCom �� ���̰�
	 }
 // ������ ���� Ŭ���� MyWinExit
	public class MyWinExit extends WindowAdapter {
	        public void windowClosing(WindowEvent we) {
	        	dispose();//���� ���� �ִ� â�� ����
	        	//System.exit(0); //JVM��ü �����Ŵ
	        }
	        
	 
	 }
 //������ ��ȯ Ŭ����
	/* public void mouseClicked(MouseEvent e) {        
	        new Meal();
	 }*/
	 
//����
	 public static void main(String[] args) {
		new MyCom();
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
	//public void mouseClicked(MouseEvent e) {}
	
	
}//class MyCom extends Frame implements MouseListener ����
