import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyCom {
	public static void main(String[] args) {

		Font basicFont=new Font(Font.SANS_SERIF,Font.PLAIN,12); //���� ��Ʈ
		Frame frame=new Frame("Tasty Co.");
		
		frame.setSize(400,600);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.WHITE);
	
		
		Color gren=new Color(26, 188, 156); //���� �÷�

//===================���==================

		Panel MyComHeader=new Panel(); //��� �г� ����
		MyComHeader.setPreferredSize(new Dimension(600,40));//��� ������ ����
		MyComHeader.setBackground(gren);//����� �����÷� ���̱�
		
		Label mycom=new Label("�� ȸ��");//��� �� ȸ�� ��Ʈ
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,18);//�����Ʈ
		mycom.setForeground(Color.WHITE);//��Ʈ ��������
		mycom.setFont(font);//���ڿ� ��Ʈ ���̱�
		
		MyComHeader.add("center",mycom); //�гο� �� ���̱�
		frame.add(MyComHeader);//�����ӿ� �г� ���̱�

//====================���================

		Button select1=new Button("����");
		Button select2=new Button("����");
		Button select3=new Button("����");
		Button select4=new Button("����");
		Button select5=new Button("����");//���ù�ư
//		------------------------------------
		Panel null1=new Panel();
		null1.setBounds(2, 3, 600, 100);
		//null1.setPreferredSize(new Dimension(600,100));
		null1.setBackground(Color.WHITE);
		
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
		
//		--------��ü����-----------		
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

//		-----------List�� ��ü�ֱ�-----------
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
//		-------�����ӿ� List�ֱ�------	

		frame.add(List);
		
//-----------------------�ݱ�------------
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}

}
