package res;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Interface extends JFrame implements ActionListener{
	private JTextField txtUserid;
	private JTextField textField;
	private JTextField txtPassword;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
         Interface(){
         	
        	setSize(738,539);
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
        	btnNewButton.addActionListener(this);
        	
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
        	lblNewLabel_2.setBounds(0, 139, 724, 353);
        	getContentPane().add(lblNewLabel_2);
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
        	
        	setVisible(true);
         }
         
         @Override
 		public void actionPerformed(ActionEvent e) {
 			if(e.getSource() == btnNewButton) {
 				new MainMenu();	
 			}
 		}


        public static void main(String[] args) {
       	         new Interface();
        	}
        }
