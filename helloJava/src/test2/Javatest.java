package test2;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Javatest extends JFrame {
	private JTextField a,b,c,d;
	private JPanel myPanel;
	private JLabel myLabel;
	
	private JLabel[] array_money = new JLabel[4];
	
	public static void main(String args[]) throws IOException {
		Javatest test = new Javatest();
		test.setVisible(true);
		System.out.println("hello");
		System.out.println("how are you");
		System.out.println("hohoho");
		System.out.println("hihihi");
	}
	
	public Javatest() {
		init();
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		
		myPanel = new JPanel();
		//myPanel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(myPanel);
		myPanel.setLayout(null);
		myPanel.setBackground(Color.blue);
		
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		d = new JTextField();
		
		
		a.setBounds(100, 50, 100, 30);	//텍스트필드의 왼쪽 위 x,y좌표 , 가로길이, 세로길이
		b.setBounds(100, 100, 100, 30);
		c.setBounds(100, 150, 100, 30);
		d.setBounds(100, 200, 100, 30);
		myPanel.add(a);
		myPanel.add(b);
		myPanel.add(c);
		myPanel.add(d);
		
		myLabel = new JLabel();
		myLabel.setText("하이요");
		//myLabel.setLocation(10,10);
		myLabel.setBounds(110, 10, 50, 40);
		myPanel.add(myLabel);
		
		for(int i=0 ; i<4 ; i++) {
			array_money[i] = new JLabel();
			array_money[i].setText("안녕하세요");
			array_money[i].setBounds(50, 50+(i*50), 40, 30);
			myPanel.add(array_money[i]);
		}
		
	}
}





