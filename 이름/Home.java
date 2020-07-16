import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home extends JFrame implements MouseListener  {
	Home() {
		Frame fr = new Frame();
		fr.setSize(400,600);
		fr.setTitle("Tasty Co.");
		fr.setBackground(Color.WHITE);
		fr.setLayout(null);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		// Tasty Co. �̹��� ����
		ImageIcon img = new ImageIcon("Tasty Co.png");
		JLabel j1 = new JLabel(img);
		fr.add(j1);
		j1.setBounds(70,75,250,250);
		
		Button b1 = new Button("��");
		Button b2 = new Button("������");
		
		//��ư ������,��ġ
		b1.setSize(100,40);
		b2.setSize(100,40);
		b1.setLocation(145, 340);
		b2.setLocation(145, 400);
//		b1.setBounds(135,320,100,40);
//		b2.setBounds(135,380,100,40);
		fr.add(b1);
		fr.add(b2);
		//'��'��ư ������ �մ� ���� ������ ����â ����
		b1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				JFrame custMain = new CustMain();
				custMain.setVisible(true);
				fr.setVisible(false);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {} 
		});
		//'������'��ư ������ ������ �α��� ������ ������â ����
		b2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new Admin_Login();
				//setVisible(true);
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
				//dispose(0); // ������ ������� 
				System.exit(0);
			}
			
		});
	}
//	public class MyWinExit extends WindowAdapter {
//		public void windowClosing(WindowEvent we) {
//			
//			System.exit(0); //JVM��ü �����Ŵ
//		}
//	}
	
	public static void main(String[] args) {
		new Home();

		
}
	//���� ������
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
