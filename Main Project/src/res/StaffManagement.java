package res;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StaffManagement implements ActionListener{
	private JFrame frame;
	private JTable table;
	private JButton list;
	private JButton salary;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private String filePath = "D:\\AWT PROJECT\\test\\staffdetail.txt";
	private JTextField textID;
	private JTextField textName;
	private JTextField textAddress;
	private JTextField textPhone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	StaffManagement(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setSize(750,650);
		frame.getContentPane().setLayout(null);
		
		list = new JButton("Staff Details");
		list.setBackground(Color.LIGHT_GRAY);
		list.setForeground(Color.DARK_GRAY);
		list.setFont(new Font("Tahoma", Font.BOLD, 18));
		list.setBounds(0, 564, 189, 49);
		frame.getContentPane().add(list);
		list.addActionListener(this);
		
		salary = new JButton("Manage Salary");
		salary.setBackground(Color.LIGHT_GRAY);
		salary.setForeground(Color.DARK_GRAY);
		salary.setFont(new Font("Tahoma", Font.BOLD, 18));
		salary.setBounds(187, 564, 186, 49);
		frame.getContentPane().add(salary);
		salary.addActionListener(this);
		
		btnNewButton = new JButton("Add Staff");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(445, 565, 131, 49);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Remove Staff");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(574, 565, 162, 49);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 736, 419);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.MAGENTA);
		table.setFont(new Font("Tahoma", Font.ITALIC, 14));
		table.setBackground(Color.ORANGE);
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		panel.setBounds(431, 417, 305, 138);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textID = new JTextField();
		textID.setBounds(68, 0, 96, 27);
		panel.add(textID);
		textID.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(68, 26, 96, 27);
		panel.add(textName);
		textName.setColumns(10);
		
		textAddress = new JTextField();
		textAddress.setBounds(68, 56, 227, 27);
		panel.add(textAddress);
		textAddress.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(68, 83, 123, 27);
		panel.add(textPhone);
		textPhone.setColumns(10);
		
		lblNewLabel = new JLabel("   ID");
		lblNewLabel.setBounds(13, 0, 45, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_1 = new JLabel("   Name");
		lblNewLabel_1.setBounds(13, 28, 45, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_2 = new JLabel("  Address");
		lblNewLabel_2.setBounds(0, 56, 58, 27);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_3 = new JLabel("Phone No.");
		lblNewLabel_3.setBounds(0, 83, 58, 27);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		
		
		frame.setVisible(true);
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==list) {
			showStaff();
		}
		else if(e.getSource()==salary) {
			
		}
		else if(e.getSource()==btnNewButton) {
			addStaff(textID.getText(), textName.getText(), textAddress.getText(), textPhone.getText());	
		}
		else if(e.getSource()==btnNewButton_1) {
			
		}
		
	}
	public void showStaff() {
		 File file = new File(filePath);
		    try {
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String firstLine = br.readLine().trim();
				String[] columnsName = firstLine.split(",");
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.setColumnIdentifiers(columnsName);
				
				Object[] tabelLines = br.lines().toArray();
				for(int i = 0;i<tabelLines.length;i++) {
					String line = tabelLines[i].toString().trim();
					String[] dataRow = line.split("/");
					model.addRow(dataRow);
				}
				table.getColumnModel().getColumn(0).setPreferredWidth(25);
				table.getColumnModel().getColumn(0).setMinWidth(25);
				table.getColumnModel().getColumn(1).setMinWidth(25);
				table.getColumnModel().getColumn(2).setPreferredWidth(195);
				table.getColumnModel().getColumn(2).setMinWidth(25);
				table.getColumnModel().getColumn(3).setMinWidth(25);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void salaryManagement() {
		
	}
	public void addStaff(String ID, String Name, String Address, String PhoneNo) {
		try {
	           FileWriter myWriter = new FileWriter(filePath,true);
	           BufferedWriter bw= new BufferedWriter(myWriter);
	           PrintWriter pw = new PrintWriter(bw);

	           pw.println(ID +"/"+Name +"/"+ Address+"/"+PhoneNo);
	           pw.flush();
	           pw.close();

	           JOptionPane.showMessageDialog(null, "New Staff Added");

	        } catch (IOException e) {
	           JOptionPane.showMessageDialog(null, "record not saved");
	           e.printStackTrace();
	          }

		
	}
	public void removeStaff() {
		
	}
}
