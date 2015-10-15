package insertdataframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import buttonflag.ButtonFlag;

class ERRDiagram extends JFrame{
	public ERRDiagram(){
		super("ERR Diagram");
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(750,515));
		pack();

		JLabel labelImage = new JLabel();

		labelImage.setIcon(new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/ERRDiagram.png"));
		getContentPane().add(labelImage);
		labelImage.setBounds(0, 0, 750,515);
	}
}

public class InsertDataFrame extends JFrame implements InsertDataFrameInterface{
	public InsertDataFrame(ButtonFlag buttonFlag){
		super("Insert Data");
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(360,360));
		pack();

		getContentPane().add(labelFrameName);
		getContentPane().add(labelTableName);
		getContentPane().add(labelListValues);
		getContentPane().add(labelDiagram);
		getContentPane().add(labelHelp);
		getContentPane().add(tableNameTextField);
		getContentPane().add(listValuesTextField);
		getContentPane().add(buttonOk);

		labelFrameName.setFont(new Font("Ubuntu", 1, 24));
		labelFrameName.setForeground(new Color(246, 9, 9));
		labelFrameName.setHorizontalAlignment(SwingConstants.CENTER);
		labelFrameName.setBounds(100, 10, 170, 50);

		labelTableName.setFont(new Font("Ubuntu", 1, 16));
		labelTableName.setForeground(new Color(22, 117, 245));
		labelTableName.setHorizontalAlignment(SwingConstants.CENTER);
		labelTableName.setBorder(BorderFactory.createEtchedBorder());
		labelTableName.setBounds(30, 90, 110, 40);

		labelListValues.setFont(new Font("Ubuntu", 1, 16));
		labelListValues.setForeground(new Color(22, 117, 245));
		labelListValues.setHorizontalAlignment(SwingConstants.CENTER);
		labelListValues.setBorder(BorderFactory.createEtchedBorder());
		labelListValues.setBounds(30, 160, 110, 40);

		labelDiagram.setFont(new Font("Ubuntu", 1, 16));
		labelDiagram.setForeground(new Color(22, 117, 245));
		labelDiagram.setHorizontalAlignment(SwingConstants.CENTER);
		labelDiagram.setBounds(250, 320, 90, 20);
		labelDiagram.setCursor(new Cursor(Cursor.HAND_CURSOR));
		labelDiagram.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				new ERRDiagram();
			}
		});

		labelHelp.setFont(new Font("Ubuntu", 1, 16));
		labelHelp.setForeground(new Color(22, 117, 245));
		labelHelp.setHorizontalAlignment(SwingConstants.CENTER);
		labelHelp.setBounds(20, 320, 40, 20);
		labelHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		labelHelp.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
				StringBuffer msg = new StringBuffer();
				msg.append("This is the window to insert new data to the database.");
				msg.append("\nYou will input the name of the table you want to insert data to in the textfield next to the Table Name 's label.");
				msg.append("\nYou will input the list of values into the textfield next to the List Values's label,");
				msg.append("\nthe values name separated by','.");
				msg.append("\nIn the textfield next to the Data Type 's label you enter data type corresponds to the columns above,");
				msg.append("\nthe name of the data types are separated by','.");
				msg.append("\nEach time you can only insert data to one table");
				JOptionPane.showMessageDialog(null,msg.toString(),"Help Of InsertDataFrame",JOptionPane.INFORMATION_MESSAGE,icon);
			}
		});

		buttonOk.setFont(new Font("Ubuntu", 1, 18));
		buttonOk.setForeground(new Color(22, 117, 245));
		buttonOk.setBounds(120, 257, 130, 40);
		buttonOk.setBackground(Color.WHITE);
		
		tableNameTextField.setBounds(170, 90, 160, 40);
		tableNameTextField.setFont(new Font("Ubuntu" , 1, 18));
		listValuesTextField.setFont(new Font("Ubuntu" , 1, 18));
		listValuesTextField.setBounds(170, 160, 160, 40);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				buttonFlag.buttonInsertFlag = 1;
				buttonFlag.buttonUpdateFlag = 1;
				buttonFlag.buttonQueryFlag = 1;
				buttonFlag.buttonDeleteFlag = 1;
			}
		});
	}
}