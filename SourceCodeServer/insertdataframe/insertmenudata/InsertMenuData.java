package insertdataframe.insertmenudata;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import errdiagram.ERRDiagram;
import sqlfunc.SQLFunc;

public class InsertMenuData {

	public JButton buttonOKMenu = new JButton("OK");

	public JLabel labelMenuName = new JLabel("INSERT MENU DATA");
	public JLabel menuFoodNameLabel =new JLabel("FoodName");
	public JLabel menuFIDLabel = new JLabel("FID");
	public JLabel menuDiagramLabel = new JLabel("ERRDIAGRAM");
	public JLabel menuHelpLabel = new JLabel("HELP");

	public JTextField menuFoodNameTextField = new JTextField();
	public JTextField menuFIDTextField = new JTextField();

	public SQLFunc sqlFunc;
	
	public InsertMenuData(JPanel panelMenu){

		panelMenu.setLayout(null);
		
		panelMenu.add(labelMenuName);
		panelMenu.add(menuFoodNameLabel);
		panelMenu.add(menuFIDLabel);
		panelMenu.add(menuHelpLabel);
		panelMenu.add(menuDiagramLabel);

		panelMenu.add(menuFoodNameTextField);
		panelMenu.add(menuFIDTextField);

		panelMenu.add(buttonOKMenu);

		menuFIDTextField.setText("");
		menuFoodNameTextField.setText("");

		labelMenuName.setFont(new Font("Ubuntu", 1, 24));
		labelMenuName.setForeground(new Color(246, 9, 9));
		labelMenuName.setHorizontalAlignment(SwingConstants.CENTER);
		labelMenuName.setBounds(180, 20, 300, 40);

		menuFoodNameLabel.setFont(new Font("Ubuntu", 1, 16)); 
		menuFoodNameLabel.setForeground(new Color(22, 117, 245));
		menuFoodNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menuFoodNameLabel.setBorder(BorderFactory.createEtchedBorder());
		menuFoodNameLabel.setBounds(120, 220, 120, 40);

		menuFIDLabel.setFont(new Font("Ubuntu", 1, 16));
		menuFIDLabel.setForeground(new Color(22, 117, 245));
		menuFIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menuFIDLabel.setBorder(BorderFactory.createEtchedBorder());
		menuFIDLabel.setBounds(120, 120, 120, 40);

		menuFoodNameTextField.setFont(new Font("Ubuntu", 1, 18));
		menuFoodNameTextField.setBounds(290, 220, 230, 40);

		menuFIDTextField.setFont(new Font("Ubuntu", 1, 18));
		menuFIDTextField.setBounds(290, 120, 230, 40);

		menuHelpLabel.setFont(new Font("Ubuntu", 1, 16)); 
		menuHelpLabel.setForeground(new Color(22, 117, 245));
		menuHelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menuHelpLabel.setBounds(20, 360, 40, 20);
		menuHelpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(menuHelpLabel.getMouseListeners().length < 1){
			menuHelpLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
					StringBuffer msg = new StringBuffer();
					msg.append("This is the window to insert new menu data to the database.");
					msg.append("\nInput data into textField correlative to labelName");
					msg.append("\nEach time you can only insert one record to table");
					JOptionPane.showMessageDialog(null,msg.toString(),"Help Of InsertMenuDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
				}
			});
		}

		buttonOKMenu.setFont(new Font("Ubuntu", 1, 18));
		buttonOKMenu.setForeground(new Color(22, 117, 245));
		buttonOKMenu.setBounds(260, 350, 120, 30);
		buttonOKMenu.setBackground(Color.WHITE);
		if(buttonOKMenu.getActionListeners().length < 1){
			buttonOKMenu.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					sqlFunc = new SQLFunc();
					String fid = new String(menuFIDTextField.getText());
					String foodName = new String(menuFoodNameTextField.getText());

					if(sqlFunc.insertDataQuery("Menu",fid,foodName,"","","","","","") > 0){
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/correct.png");
						JOptionPane.showMessageDialog(null,"Query Command Is Completed","Help Of InsertMenuDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
						
						menuFIDTextField.setText("");
						menuFoodNameTextField.setText("");
					}
					else{
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/wrong.png");
						JOptionPane.showMessageDialog(null,"Error In Query Command","Help Of InsertMenuDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			});
		}

		menuDiagramLabel.setFont(new Font("Ubuntu", 1, 16));
		menuDiagramLabel.setForeground(new Color(22, 117, 245));
		menuDiagramLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menuDiagramLabel.setBounds(520, 360, 120, 20);
		menuDiagramLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(menuDiagramLabel.getMouseListeners().length < 1){
			menuDiagramLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					new ERRDiagram();
				}
			});
		}
	}
}