import java.awt.*;
class StudentRegistration extends Frame
{    Label L1,L2,L3,L4,L5,L6,L7,L8;
     TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	StudentRegistration()
	{
		setLayout(null);
		Font f1=new Font("Times new roman",Font.BOLD|Font.ITALIC,25);
		Font f2=new Font("Times new roman",Font.ITALIC,20);
		L1=new Label("*****Student Registration Form***** ");
		L1.setFont(f1);
		setFont(f2);
		L1.setBackground(Color.yellow);
		setBackground(Color.orange);
		setForeground(Color.red);
		
		L2=new Label("Enter the first Name:",Label.RIGHT);
		L3=new Label("Enter the last Name ",Label.RIGHT);
		L4=new Label("Enter the Address ",Label.RIGHT);
		L5=new Label("Enter the Mobile No ",Label.RIGHT);
		L6=new Label("Enter the email id ",Label.RIGHT);
		L7=new Label("Enter the city name ",Label.RIGHT);
		L8=new Label("Enter DOB ",Label.RIGHT);
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		tf4=new TextField(20);
		tf5=new TextField(20);
		tf6=new TextField(20);
		tf7=new TextField(20);
		
		Button b1=new Button("Submit");
		L1.setBounds(100,100,500,50);
		
		L2.setBounds(100,200,200,30);
		tf1.setBounds(350,200,180,30);
		
		L3.setBounds(100,250,200,30);
		tf2.setBounds(350,250,180,30);
		
		L4.setBounds(100,300,200,30);
		tf3.setBounds(350,300,180,30);
		
		L5.setBounds(100,350,200,30);
		tf4.setBounds(350,350,180,30);
		
		L6.setBounds(100,400,200,30);
		tf5.setBounds(350,400,180,30);
		
		L7.setBounds(100,450,200,30);
		tf6.setBounds(350,450,180,30);
		
		L8.setBounds(100,500,200,30);
		tf7.setBounds(350,500,180,30);
		
		add(L1);add(L2);add(tf1);add(L3);add(tf2);add(L4);add(tf3);add(L5);add(tf4);
		add(L6);add(tf5);add(L7);add(tf6);add(L8);add(tf7);
		
		
	}
	public static void main( String args[])
	{
		StudentRegistration S1=new StudentRegistration();
	S1.setVisible(true);
    S1.setTitle("VJTech Login Form");
    S1.setSize(600,600);
	}
}