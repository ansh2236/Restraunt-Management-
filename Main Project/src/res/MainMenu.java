package res;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame implements ActionListener{
	
	private JTextField txtUserid;
	private JTextField textField;
	private JTextField txtPassword;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_1;
	
	MainMenu(){
	   setSize(938,639);
	   getContentPane().setLayout(null);
	   lblNewLabel = new JLabel("");
   	Image img=new ImageIcon(this.getClass().getResource("/banner.jpg")).getImage();
   	lblNewLabel.setIcon(new ImageIcon(img));
   	lblNewLabel.setBounds(0, 0, 724, 140);
   	getContentPane().add(lblNewLabel);
   	
   	
   	btnNewButton = new JButton("Login");
   	btnNewButton.setForeground(Color.RED);
   	btnNewButton.setBackground(Color.ORANGE);
   	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
   	btnNewButton.setBounds(276, 325, 119, 41);
   	getContentPane().add(btnNewButton);
   	
   	
   	txtUserid = new JTextField();
   	txtUserid.setBackground(Color.ORANGE);
   	txtUserid.setFont(new Font("Tahoma", Font.BOLD, 15));
   	txtUserid.setText("UserID");
   	txtUserid.setBounds(184, 197, 84, 46);
   	getContentPane().add(txtUserid);
   	txtUserid.setColumns(10);
   	
   	textField = new JTextField();
   	textField.setBackground(Color.YELLOW);
   	textField.setFont(new Font("Tahoma", Font.BOLD, 14));
   	textField.setBounds(298, 197, 155, 46);
   	getContentPane().add(textField);
   	textField.setColumns(10);
   	
   	txtPassword = new JTextField();
   	txtPassword.setBackground(Color.ORANGE);
   	txtPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
   	txtPassword.setText("Password");
   	txtPassword.setBounds(182, 264, 84, 41);
   	getContentPane().add(txtPassword);
   	txtPassword.setColumns(10);
   	
   	textField_1 = new JTextField();
   	textField_1.setBackground(Color.YELLOW);
   	textField_1.setBounds(298, 264, 155, 41);
   	getContentPane().add(textField_1);
   	textField_1.setColumns(10);
   	
   	
   	lblNewLabel_2 = new JLabel("");
   	Image img2=new ImageIcon(this.getClass().getResource("/poster1.jpg")).getImage();
   	lblNewLabel_2.setIcon(new ImageIcon(img2));
   	lblNewLabel_2.setBounds(0, 139, 724, 358);
   	getContentPane().add(lblNewLabel_2);
   	
   	btnNewButton_1 = new JButton("Order");
   	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
   	btnNewButton_1.setBounds(725, 0, 199, 107);
   	getContentPane().add(btnNewButton_1);
   	btnNewButton_1.addActionListener(this);
   	
   	btnNewButton_2 = new JButton("Staff Management");
   	btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
   	btnNewButton_2.setBounds(725, 102, 199, 107);
   	getContentPane().add(btnNewButton_2);
   	btnNewButton_2.addActionListener(this);
   	
   	btnNewButton_3 = new JButton("Menu");
   	btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
   	btnNewButton_3.setBounds(725, 206, 199, 99);
   	getContentPane().add(btnNewButton_3);
   	btnNewButton_3.addActionListener(this);
   	
   	btnNewButton_4 = new JButton("Order Details");
   	btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
   	btnNewButton_4.setBounds(725, 304, 199, 107);
   	getContentPane().add(btnNewButton_4);
   	btnNewButton_4.addActionListener(this);
   	
   	btnNewButton_5 = new JButton("Complaints");
   	btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 17));
   	btnNewButton_5.setBounds(725, 409, 199, 107);
   	getContentPane().add(btnNewButton_5);
   	btnNewButton_5.addActionListener(this);
   	
   	btnNewButton_6 = new JButton("Exit");
   	btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
   	btnNewButton_6.setBounds(725, 514, 199, 88);
   	getContentPane().add(btnNewButton_6);
   	btnNewButton_6.addActionListener(this);
   	
   	lblNewLabel_1 = new JLabel("");
   	Image img3=new ImageIcon(this.getClass().getResource("/tt.jpg")).getImage();
   	lblNewLabel_1.setIcon(new ImageIcon(img3));
   	lblNewLabel_1.setBounds(0, 495, 724, 107);
   	getContentPane().add(lblNewLabel_1);
   	
   	
   	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
	   setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnNewButton_1) {
				new Order();
			}
			else if(e.getSource()==btnNewButton_2) {
				new StaffManagement();
			}
			else if(e.getSource()==btnNewButton_3) {
				new Menu();
			}
			else if(e.getSource()==btnNewButton_4) {
				new OrderDetails();
			}
			else if(e.getSource()==btnNewButton_5) {
				new Complaints();
			}
			else if(e.getSource()==btnNewButton_6) {
				System.exit(0);
			}
			
		}
		
	}

