package res;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.*;

public class Menu extends JFrame implements ActionListener{
	private JButton addItem;
	private JButton delete;
	private String s;
	private JTextField textField_1;
	private String filePath= "D:\\AWT PROJECT\\test\\Menu Item.txt";
	private String[] values;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;

	Menu(){
		getContentPane().setBackground(Color.ORANGE);
	setSize(938,639);
	getContentPane().setLayout(null);
	
	addItem = new JButton("Add Item");
	addItem.setBounds(0, 545, 181, 47);
	getContentPane().add(addItem);
	addItem.addActionListener(this);
	
	delete = new JButton("Delete Item");
	delete.setBounds(741, 545, 173, 47);
	getContentPane().add(delete);
	
	JLabel AddItem = new JLabel("");
	AddItem.setBounds(218, 565, 198, 27);
	getContentPane().add(AddItem);
	
	textField_1 = new JTextField();
	textField_1.setBounds(218, 565, 198, 27);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 0, 924, 535);
	getContentPane().add(scrollPane);
	
	table = new JTable();
	table.setBackground(Color.GRAY);
	table.setFont(new Font("Tahoma", Font.PLAIN, 16));
	table.setForeground(Color.WHITE);
	scrollPane.setViewportView(table);
	
	JLabel IDspace = new JLabel("");
	IDspace.setBounds(426, 565, 54, 27);
	getContentPane().add(IDspace);
	
	textField = new JTextField();
	textField.setBounds(426, 565, 54, 27);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBounds(485, 565, 60, 27);
	getContentPane().add(lblNewLabel);
	
	textField_2 = new JTextField();
	textField_2.setBounds(482, 565, 63, 27);
	getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	JLabel DownItem = new JLabel("Item Name");
	DownItem.setFont(new Font("Tahoma", Font.PLAIN, 17));
	DownItem.setBounds(233, 539, 96, 27);
	getContentPane().add(DownItem);
	
	JLabel DownID = new JLabel("   ID");
	DownID.setFont(new Font("Tahoma", Font.PLAIN, 17));
	DownID.setBounds(426, 539, 54, 27);
	getContentPane().add(DownID);
	
	JLabel DownPrice = new JLabel("Price");
	DownPrice.setFont(new Font("Tahoma", Font.PLAIN, 17));
	DownPrice.setBounds(485, 539, 60, 27);
	getContentPane().add(DownPrice);
	
	readRecords();
	
	setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addItem) {
			saveNewItems(textField.getText(),textField_1.getText(),textField_2.getText());
		}
	}
	 public void readRecords() {
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	 public void saveNewItems(String ID, String ItemName, String Price) {
		 try {
	           FileWriter myWriter = new FileWriter(filePath,true);
	           BufferedWriter bw= new BufferedWriter(myWriter);
	           PrintWriter pw = new PrintWriter(bw);

	           pw.println(ID +"/"+ItemName +"/"+ Price);
	           pw.flush();
	           pw.close();

	           JOptionPane.showMessageDialog(null, "Item saved restart the Application to see the added Item");

	        } catch (IOException e) {
	           JOptionPane.showMessageDialog(null, "record not saved");
	           e.printStackTrace();
	          }
	 }
}
