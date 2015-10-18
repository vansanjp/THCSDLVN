package insertdataframe.insertreservationdata;

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

public class InsertReservationData {

	public JLabel labelReservationName = new JLabel("INSERT RESERVATIONS DATA");
	public JLabel reservationAIDLabel = new JLabel("AID");
	public JLabel reservationFoodListLabel = new JLabel("FoodList");
	public JLabel reservationTimeLabel = new JLabel("Time");
	public JLabel reservationRIDLabel = new JLabel("RID");
	public JLabel reservationHelpLabel = new JLabel("HELP");
	public JLabel reservationDiagramLabel = new JLabel("ERRDIAGRAM");

	public JTextField reservationAIDTextField = new JTextField();
	public JTextField reservationFoodListTextField = new JTextField();
	public JTextField reservationTimeTextField = new JTextField();
	public JTextField reservationRIDTextField = new JTextField();

	public JButton buttonOKReservations = new JButton("OK");

	public SQLFunc sqlFunc;
	
	public InsertReservationData(JPanel panelReservations){
		panelReservations.setLayout(null);
		
		panelReservations.add(labelReservationName);
		panelReservations.add(reservationAIDLabel);
		panelReservations.add(reservationFoodListLabel);
		panelReservations.add(reservationTimeLabel);
		panelReservations.add(reservationRIDLabel);
		panelReservations.add(reservationHelpLabel);
		panelReservations.add(reservationDiagramLabel);

		panelReservations.add(reservationAIDTextField);
		panelReservations.add(reservationFoodListTextField);
		panelReservations.add(reservationTimeTextField);
		panelReservations.add(reservationRIDTextField);

		panelReservations.add(buttonOKReservations);

		reservationRIDTextField.setText("");
		reservationAIDTextField.setText("");
		reservationFoodListTextField.setText("");
		reservationTimeTextField.setText("");

		labelReservationName.setFont(new Font("Ubuntu", 1, 24));
		labelReservationName.setForeground(new Color(246, 9, 9));
		labelReservationName.setHorizontalAlignment(SwingConstants.CENTER);
		labelReservationName.setBounds(160, 20, 360, 40);

		reservationAIDLabel.setFont(new Font("Ubuntu", 1, 16));
		reservationAIDLabel.setForeground(new Color(22, 117, 245));
		reservationAIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationAIDLabel.setBorder(BorderFactory.createEtchedBorder());
		reservationAIDLabel.setBounds(120, 150, 120, 40);

		reservationFoodListLabel.setFont(new Font("Ubuntu", 1, 16));
		reservationFoodListLabel.setForeground(new Color(22, 117, 245));
		reservationFoodListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationFoodListLabel.setBorder(BorderFactory.createEtchedBorder());
		reservationFoodListLabel.setBounds(120, 210, 120, 40);

		reservationTimeLabel.setFont(new Font("Ubuntu", 1, 16));
		reservationTimeLabel.setForeground(new Color(22, 117, 245));
		reservationTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationTimeLabel.setBorder(BorderFactory.createEtchedBorder());
		reservationTimeLabel.setBounds(120, 270, 120, 40);

		reservationRIDLabel.setFont(new Font("Ubuntu", 1, 16)); 
		reservationRIDLabel.setForeground(new Color(22, 117, 245));
		reservationRIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationRIDLabel.setBorder(BorderFactory.createEtchedBorder());
		reservationRIDLabel.setBounds(120, 90, 120, 40);

		reservationAIDTextField.setFont(new Font("Ubuntu", 0, 18));  
		reservationAIDTextField.setBounds(290, 150, 230, 40);

		reservationFoodListTextField.setFont(new Font("Ubuntu", 0, 18));
		reservationFoodListTextField.setBounds(290, 210, 230, 40);

		reservationTimeTextField.setFont(new Font("Ubuntu", 0, 18));
		reservationTimeTextField.setBounds(290, 270, 230, 40);

		reservationRIDTextField.setFont(new java.awt.Font("Ubuntu", 0, 18));
		reservationRIDTextField.setBounds(290, 90, 230, 40);

		reservationHelpLabel.setFont(new Font("Ubuntu", 1, 16)); 
		reservationHelpLabel.setForeground(new Color(22, 117, 245));
		reservationHelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationHelpLabel.setBounds(20, 360, 40, 20);
		reservationHelpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(reservationHelpLabel.getMouseListeners().length < 1){
			reservationHelpLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
					StringBuffer msg = new StringBuffer();
					msg.append("This is the window to insert new reservation data to the database.");
					msg.append("\nInput data into textField correlative to labelName");
					msg.append("\nEach time you can only insert one record to table");
					JOptionPane.showMessageDialog(null,msg.toString(),"Help Of InsertReservationDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
				}
			});
		}

		buttonOKReservations.setFont(new Font("Ubuntu", 1, 18));
		buttonOKReservations.setForeground(new Color(22, 117, 245));
		buttonOKReservations.setText("OK");
		buttonOKReservations.setBounds(260, 350, 120, 30);
		buttonOKReservations.setBackground(Color.WHITE);
		if(buttonOKReservations.getActionListeners().length < 1){
			buttonOKReservations.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					sqlFunc = new SQLFunc();
					String rid = new String(reservationRIDTextField.getText());
					String aid = new String(reservationAIDTextField.getText());
					String foodlist = new String(reservationFoodListTextField.getText());
					String time = new String(reservationTimeTextField.getText());

					if(sqlFunc.insertDataQuery("Reservations",rid,aid,foodlist,time,"","","","") > 0){
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/correct.png");
						JOptionPane.showMessageDialog(null,"Query Command Is Completed","Help Of InsertReservationDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
						
						reservationRIDTextField.setText("");
						reservationAIDTextField.setText("");
						reservationFoodListTextField.setText("");
						reservationTimeTextField.setText("");
					}
					else{
						Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/wrong.png");
						JOptionPane.showMessageDialog(null,"Error In Query Command","Help Of InsertReservationDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			});
		}

		reservationDiagramLabel.setFont(new Font("Ubuntu", 1, 16));
		reservationDiagramLabel.setForeground(new Color(22, 117, 245));
		reservationDiagramLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationDiagramLabel.setBounds(520, 360, 120, 20);
		reservationDiagramLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if(reservationDiagramLabel.getMouseListeners().length < 1){
			reservationDiagramLabel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					new ERRDiagram();
				}
			});
		}
	}
}