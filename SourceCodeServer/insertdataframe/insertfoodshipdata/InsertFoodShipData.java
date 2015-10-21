package insertdataframe.insertfoodshipdata;

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

public class InsertFoodShipData {
	public JLabel labelFoodShipName = new JLabel("INSERT FOODSHIP DATA");
	public JLabel foodshipAIDLabel = new JLabel("AID");
	public JLabel foodshipFoodListLabel = new JLabel("FoodList");
	public JLabel foodshipTimeLabel = new JLabel("Time");
	public JLabel foodshipAddressLabel = new JLabel("ShipAddress");
	public JLabel foodshipRIDLabel = new JLabel("FID");
	public JLabel foodshipHelpLabel = new JLabel("HELP");
	public JLabel foodshipDiagramLabel = new JLabel("ERRDIAGRAM");

	public JTextField foodshipTimeTextField = new JTextField();
	public JTextField foodshipAddressTextField = new JTextField();
	public JTextField foodshipFoodListTextField = new JTextField();
	public JTextField foodshipAIDTextField = new JTextField();
	public JTextField foodshipRIDTextField = new JTextField();

	public JButton buttonOKFoodShip = new JButton("OK");

	public SQLFunc sqlFunc;

	public InsertFoodShipData(JPanel panelFoodShip){

		panelFoodShip.setLayout(null);
		
		panelFoodShip.add(labelFoodShipName);
		panelFoodShip.add(foodshipAIDLabel);
		panelFoodShip.add(foodshipFoodListLabel);
		panelFoodShip.add(foodshipTimeLabel);
		panelFoodShip.add(foodshipAddressLabel);
		panelFoodShip.add(foodshipRIDLabel);
		panelFoodShip.add(foodshipHelpLabel);
		panelFoodShip.add(foodshipDiagramLabel);

		panelFoodShip.add(foodshipTimeTextField);
		panelFoodShip.add(foodshipAddressTextField);
		panelFoodShip.add(foodshipFoodListTextField);
		panelFoodShip.add(foodshipAIDTextField);
		panelFoodShip.add(foodshipRIDTextField);

		panelFoodShip.add(buttonOKFoodShip);

		foodshipAIDTextField.setText("");
		foodshipRIDTextField.setText("");
		foodshipFoodListTextField.setText("");
		foodshipAddressTextField.setText("");
		foodshipTimeTextField.setText("");

		labelFoodShipName.setFont(new Font("Ubuntu", 1, 24)); 
		labelFoodShipName.setForeground(new Color(246, 9, 9));
		labelFoodShipName.setHorizontalAlignment(SwingConstants.CENTER);
		labelFoodShipName.setBounds(150, 10, 360, 40);

		foodshipAIDLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipAIDLabel.setForeground(new Color(22, 117, 245));
		foodshipAIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipAIDLabel.setBorder(BorderFactory.createEtchedBorder());
		foodshipAIDLabel.setBounds(110, 120, 120, 40);

		foodshipFoodListLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipFoodListLabel.setForeground(new Color(22, 117, 245));
		foodshipFoodListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipFoodListLabel.setBorder(BorderFactory.createEtchedBorder());
		foodshipFoodListLabel.setBounds(110, 170, 120, 40);

		foodshipTimeLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipTimeLabel.setForeground(new Color(22, 117, 245));
		foodshipTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipTimeLabel.setBorder(BorderFactory.createEtchedBorder());
		foodshipTimeLabel.setBounds(110, 220, 120, 40);

		foodshipAddressLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipAddressLabel.setForeground(new Color(22, 117, 245));
		foodshipAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipAddressLabel.setBorder(BorderFactory.createEtchedBorder());
		foodshipAddressLabel.setBounds(110, 270, 120, 40);

		foodshipRIDLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipRIDLabel.setForeground(new Color(22, 117, 245));
		foodshipRIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipRIDLabel.setBorder(BorderFactory.createEtchedBorder());
		foodshipRIDLabel.setBounds(110, 70, 120, 40);

		foodshipAddressTextField.setFont(new Font("Ubuntu", 1, 18));
		foodshipAddressTextField.setBounds(300, 270, 250, 40);

		foodshipTimeTextField.setFont(new Font("Ubuntu", 1, 18)); 
		foodshipTimeTextField.setBounds(300, 220, 250, 40);

		foodshipFoodListTextField.setFont(new Font("Ubuntu", 1, 18));
		foodshipFoodListTextField.setBounds(300, 170, 250, 40);

		foodshipAIDTextField.setFont(new Font("Ubuntu", 1, 18));
		foodshipAIDTextField.setBounds(300, 120, 250, 40);

		foodshipRIDTextField.setFont(new Font("Ubuntu", 1, 18)); 
		foodshipRIDTextField.setBounds(300, 70, 250, 40);

		foodshipHelpLabel.setFont(new Font("Ubuntu", 1, 16));
		foodshipHelpLabel.setForeground(new Color(22, 117, 245));
		foodshipHelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodshipHelpLabel.setBounds(20, 360, 40, 20);
		foodshipHelpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(foodshipHelpLabel.getMouseListeners().length < 1){
			foodshipHelpLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
					StringBuffer msg = new StringBuffer();
					msg.append("This is the window to insert new foodship data to the database.");
					msg.append("\nInput data into textField correlative to labelName");
					msg.append("\nEach time you can only insert one record to table");
					JOptionPane.showMessageDialog(null,msg.toString(),"Help Of InsertFoodShipDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
				}
			});
		}

		buttonOKFoodShip.setFont(new Font("Ubuntu", 1, 18)); 
		buttonOKFoodShip.setForeground(new Color(22, 117, 245));
		buttonOKFoodShip.setText("OK");
		buttonOKFoodShip.setBounds(260, 350, 120, 30);
		buttonOKFoodShip.setBackground(Color.WHITE);
		if(buttonOKFoodShip.getActionListeners().length < 1){
			buttonOKFoodShip.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					sqlFunc = new SQLFunc();
					String aid = new String(foodshipAIDTextField.getText());
					String rid = new String(foodshipRIDTextField.getText());
					String foodlist = new String(foodshipFoodListTextField.getText());
					String address = new String(foodshipAddressTextField.getText());
					String time = new String(foodshipTimeTextField.getText());

					if(sqlFunc.insertDataQuery("FoodShip",aid,rid,foodlist,address,time,"","","") > 0){
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/correct.png");
						JOptionPane.showMessageDialog(null,"Query Command Is Completed","Help Of InsertFoodShipDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
						
						foodshipAIDTextField.setText("");
						foodshipRIDTextField.setText("");
						foodshipFoodListTextField.setText("");
						foodshipAddressTextField.setText("");
						foodshipTimeTextField.setText("");
					}
					else{
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/wrong.png");
						JOptionPane.showMessageDialog(null,"Error In Query Command","Help Of InsertFoodShipDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			});
		}

		foodshipDiagramLabel.setFont(new java.awt.Font("Ubuntu", 1, 16));
		foodshipDiagramLabel.setForeground(new java.awt.Color(22, 117, 245));
		foodshipDiagramLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		foodshipDiagramLabel.setBounds(520, 360, 120, 20);
		foodshipDiagramLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(foodshipDiagramLabel.getMouseListeners().length < 1){
			foodshipDiagramLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					new ERRDiagram();
				}
			});
		}
	}
}