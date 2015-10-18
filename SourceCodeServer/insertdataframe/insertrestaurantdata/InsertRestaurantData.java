package insertdataframe.insertrestaurantdata;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

public class InsertRestaurantData {

	public JLabel labelNameRestaurant = new JLabel("INSERT RESTAURANT DATA");
	public JLabel labeltableNameRestaurant = new JLabel("RestaurantName");
	public JLabel labelRestaurantAddress = new JLabel("Address");
	public JLabel labelRestaurantPhone = new JLabel("Phone");
	public JLabel labelResPass = new JLabel("ResPass");
	public JLabel restaurantridLabel = new JLabel("RID");
	public JLabel restaurantFaceLabel = new JLabel("Facebook");
	public JLabel rateLabel = new JLabel("Rate");
	public JLabel resNameLabel = new JLabel("ResName");
	public JLabel restaurantHelpLabel = new JLabel("HELP");
	public JLabel restaurantDiagramLabel = new JLabel("ERRDIAGRAM");

	public JButton buttonOKRestaurant = new JButton("OK");

	public JTextField restaurantNameTextField = new JTextField();
	public JTextField restaurantAddressTextField = new JTextField();
	public JTextField restaurantPhoneTextField = new JTextField();
	public JTextField restaurantRIDTextField = new JTextField();
	public JTextField restaurantFaceTextField = new JTextField();
	public JTextField resNameTextField = new JTextField();
	public JTextField rateTextField = new JTextField();
	public JTextField resPassTextField = new JTextField();

	public SQLFunc sqlFunc;

	public InsertRestaurantData(JPanel panelRestaurant){

		panelRestaurant.setLayout(null);

		panelRestaurant.add(labelNameRestaurant);
		panelRestaurant.add(labeltableNameRestaurant);
		panelRestaurant.add(labelRestaurantAddress);
		panelRestaurant.add(labelRestaurantPhone);
		panelRestaurant.add(labelResPass);
		panelRestaurant.add(restaurantridLabel);
		panelRestaurant.add(restaurantFaceLabel);
		panelRestaurant.add(rateLabel);
		panelRestaurant.add(resNameLabel);
		panelRestaurant.add(restaurantDiagramLabel);
		panelRestaurant.add(restaurantHelpLabel);
		
		panelRestaurant.add(restaurantNameTextField);
		panelRestaurant.add(restaurantAddressTextField);
		panelRestaurant.add(restaurantPhoneTextField);
		panelRestaurant.add(restaurantRIDTextField);
		panelRestaurant.add(restaurantFaceTextField);
		panelRestaurant.add(resPassTextField);
		panelRestaurant.add(resNameTextField);
		panelRestaurant.add(rateTextField);

		panelRestaurant.add(buttonOKRestaurant);

		restaurantRIDTextField.setText("");
		restaurantNameTextField.setText("");
		restaurantAddressTextField.setText("");
		restaurantPhoneTextField.setText("");
		restaurantFaceTextField.setText("");
		rateTextField.setText("");
		resNameTextField.setText("");
		resPassTextField.setText("");

		labelNameRestaurant.setFont(new Font("Ubuntu", 1, 24));
		labelNameRestaurant.setForeground(new Color(246, 9, 9));
		labelNameRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
		labelNameRestaurant.setBounds(160, 10, 350, 40);

		labeltableNameRestaurant.setFont(new Font("Ubuntu", 1, 14));
		labeltableNameRestaurant.setForeground(new Color(22, 117, 245));
		labeltableNameRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
		labeltableNameRestaurant.setBorder(BorderFactory.createEtchedBorder());
		labeltableNameRestaurant.setBounds(20, 150, 120, 40);

		labelRestaurantAddress.setFont(new Font("Ubuntu", 1, 16));
		labelRestaurantAddress.setForeground(new Color(22, 117, 245));
		labelRestaurantAddress.setHorizontalAlignment(SwingConstants.CENTER);
		labelRestaurantAddress.setBorder(BorderFactory.createEtchedBorder());
		labelRestaurantAddress.setBounds(20, 220, 120, 40);

		labelRestaurantPhone.setFont(new Font("Ubuntu", 1, 16));
		labelRestaurantPhone.setForeground(new Color(22, 117, 245));
		labelRestaurantPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelRestaurantPhone.setBorder(BorderFactory.createEtchedBorder());
		labelRestaurantPhone.setBounds(20, 290, 120, 40);

		labelResPass.setFont(new Font("Ubuntu", 1, 16));
		labelResPass.setForeground(new Color(22, 117, 245));
		labelResPass.setHorizontalAlignment(SwingConstants.CENTER);
		labelResPass.setBorder(BorderFactory.createEtchedBorder());
		labelResPass.setBounds(360, 290, 110, 40);

		restaurantNameTextField.setFont(new Font("Ubuntu", 1, 18));
		restaurantNameTextField.setBounds(160, 150, 160, 40);

		restaurantAddressTextField.setFont(new Font("Ubuntu", 1, 18));
		restaurantAddressTextField.setBounds(160, 220, 160, 40);

		restaurantPhoneTextField.setFont(new Font("Ubuntu", 1, 18));
		restaurantPhoneTextField.setBounds(160, 290, 160, 40);

		resPassTextField.setFont(new Font("Ubuntu", 1, 18)); 
		resPassTextField.setBounds(490, 290, 160, 40);

		restaurantridLabel.setFont(new Font("Ubuntu", 1, 16));
		restaurantridLabel.setForeground(new Color(22, 117, 245));
		restaurantridLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantridLabel.setBorder(BorderFactory.createEtchedBorder());
		restaurantridLabel.setBounds(20, 80, 120, 40);

		restaurantFaceLabel.setFont(new Font("Ubuntu", 1, 16));
		restaurantFaceLabel.setForeground(new Color(22, 117, 245));
		restaurantFaceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantFaceLabel.setBorder(BorderFactory.createEtchedBorder());
		restaurantFaceLabel.setBounds(360, 80, 110, 40);

		rateLabel.setFont(new Font("Ubuntu", 1, 16));
		rateLabel.setForeground(new Color(22, 117, 245));
		rateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rateLabel.setBorder(BorderFactory.createEtchedBorder());
		rateLabel.setBounds(360, 150, 110, 40);

		resNameLabel.setFont(new Font("Ubuntu", 1, 16));
		resNameLabel.setForeground(new Color(22, 117, 245));
		resNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resNameLabel.setBorder(BorderFactory.createEtchedBorder());
		resNameLabel.setBounds(360, 220, 110, 40);

		restaurantRIDTextField.setFont(new Font("Ubuntu", 1, 18));
		restaurantRIDTextField.setBounds(160, 80, 160, 40);

		restaurantFaceTextField.setFont(new Font("Ubuntu", 1, 18));
		restaurantFaceTextField.setBounds(490, 80, 160, 40);

		rateTextField.setFont(new Font("Ubuntu", 1, 18));
		rateTextField.setBounds(490, 150, 160, 40);

		resNameTextField.setFont(new Font("Ubuntu", 1, 18));
		resNameTextField.setBounds(490, 220, 160, 40);

		restaurantDiagramLabel.setFont(new Font("Ubuntu", 1, 16));
		restaurantDiagramLabel.setForeground(new Color(22, 117, 245));
		restaurantDiagramLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantDiagramLabel.setBounds(520, 360, 120, 20);
		restaurantDiagramLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(restaurantDiagramLabel.getMouseListeners().length < 1){
			restaurantDiagramLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					new ERRDiagram();
				}
			});
		}

		buttonOKRestaurant.setFont(new Font("Ubuntu", 1, 18));
		buttonOKRestaurant.setForeground(new Color(22, 117, 245));
		buttonOKRestaurant.setBounds(270, 360, 120, 30);
		buttonOKRestaurant.setBackground(Color.WHITE);
		if(buttonOKRestaurant.getActionListeners().length < 1){
			buttonOKRestaurant.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					sqlFunc = new SQLFunc();
					String rid = new String(restaurantRIDTextField.getText());
					String restaurantName = new String(restaurantNameTextField.getText());
					String address = new String(restaurantAddressTextField.getText());
					String phone = new String(restaurantPhoneTextField.getText());
					String face = new String(restaurantFaceTextField.getText());
					String rate = new String(rateTextField.getText());
					String resName = new String(resNameTextField.getText());
					String resPass = new String(resPassTextField.getText());

					if(sqlFunc.insertDataQuery("Restaurant",rid,restaurantName,address,phone,face,rate,resName,resPass) > 0){
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/correct.png");
						JOptionPane.showMessageDialog(null,"Query Command Is Completed","Help Of InsertRestaurantDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
						
						restaurantRIDTextField.setText("");
						restaurantNameTextField.setText("");
						restaurantAddressTextField.setText("");
						restaurantPhoneTextField.setText("");
						restaurantFaceTextField.setText("");
						rateTextField.setText("");
						resNameTextField.setText("");
						resPassTextField.setText("");
					}
					else{
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/wrong.png");
						JOptionPane.showMessageDialog(null,"Error In Query Command","Help Of InsertRestaurantDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			});
		}

		restaurantHelpLabel.setFont(new Font("Ubuntu", 1, 16));
		restaurantHelpLabel.setForeground(new Color(22, 117, 245));
		restaurantHelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantHelpLabel.setBounds(20, 360, 40, 20);
		restaurantHelpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(restaurantHelpLabel.getMouseListeners().length < 1){
			restaurantHelpLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
					StringBuffer msg = new StringBuffer();
					msg.append("This is the window to insert new data to the database.");
					msg.append("\nInput data into textField correlative to labelName");
					msg.append("\nEach time you can only insert one record to table");
					JOptionPane.showMessageDialog(null,msg.toString(),"Help Of InsertRestaurantDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
				}
			});
		}
	}
}