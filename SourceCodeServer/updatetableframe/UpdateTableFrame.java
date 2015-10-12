package updatetableframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;	

import buttonflag.ButtonFlag;

public class UpdateTableFrame extends JFrame implements UpdateTableFrameInterface{
	public UpdateTableFrame(ButtonFlag buttonFlag){
		super("Update Table");
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(360, 360));
		pack();

		getContentPane().add(labelFrameName);
		getContentPane().add(labelTableName);
		getContentPane().add(labelHelp);
		getContentPane().add(labelSetNewValue);
		getContentPane().add(labelCondition);
		getContentPane().add(tableNameTextField);
		getContentPane().add(buttonOk);
		getContentPane().add(setNewValueTextField);
		getContentPane().add(conditionTextField);

		labelFrameName.setFont(new Font("Ubuntu", 1, 24));
		labelFrameName.setForeground(new Color(246, 9, 9));
		labelFrameName.setHorizontalAlignment(SwingConstants.CENTER);
		labelFrameName.setBounds(90, 10, 190, 50);

		labelTableName.setFont(new Font("Ubuntu", 1, 16));
		labelTableName.setForeground(new Color(22, 117, 245));
		labelTableName.setHorizontalAlignment(SwingConstants.CENTER);
		labelTableName.setBorder(BorderFactory.createEtchedBorder());
		labelTableName.setBounds(30, 70, 110, 40);

		labelSetNewValue.setFont(new Font("Ubuntu", 1, 15));
		labelSetNewValue.setForeground(new Color(22, 117, 245));
		labelSetNewValue.setHorizontalAlignment(SwingConstants.CENTER);
		labelSetNewValue.setBorder(BorderFactory.createEtchedBorder());
		labelSetNewValue.setBounds(30, 130, 110, 40);

		labelCondition.setFont(new Font("Ubuntu", 1, 16));
		labelCondition.setForeground(new Color(22, 117, 245));
		labelCondition.setHorizontalAlignment(SwingConstants.CENTER);
		labelCondition.setBorder(BorderFactory.createEtchedBorder());
		labelCondition.setBounds(30, 190, 110, 40);

		labelHelp.setFont(new Font("Ubuntu", 1, 16));
		labelHelp.setForeground(new Color(22, 117, 245));
		labelHelp.setHorizontalAlignment(SwingConstants.CENTER);
		labelHelp.setBounds(20, 320, 40, 20);
		labelHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		labelHelp.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
				String msg = "This is the window to update data, you enter into the textfield next to the table name Table Name 's label."+
							"\nAt every moment you can only update data of only one table."+
							"\nIn the textfield next to the List Column 's label,"+
							"\nyou'll enter a list of data columns in the table that you want to update"+
							"\nthe names of the columns will be separated by ','."+
							"\nIn the textfield next to the Set New Value 's Label"+
							"\nYou will input new value corresponds to the column above"+
							"\nInput to the textfield next to the Condition 's label condition of update"+
							"\nClick OK to complete update.";
				JOptionPane.showMessageDialog(null,msg,"Help Of DataQueryFrame",JOptionPane.INFORMATION_MESSAGE,icon);
			}
		});

		buttonOk.setFont(new Font("Ubuntu", 1, 18));
		buttonOk.setForeground(new Color(22, 117, 245));
		buttonOk.setBounds(120, 257, 130, 40);
		buttonOk.setBackground(Color.WHITE);
		
		tableNameTextField.setBounds(170, 70, 160, 40);
		tableNameTextField.setFont(new Font("Ubuntu" , 1, 18));
		setNewValueTextField.setFont(new Font("Ubuntu", 1, 18));
		setNewValueTextField.setBounds(170, 130, 160, 40);
		conditionTextField.setBounds(170, 190, 160, 40);
		conditionTextField.setFont(new Font("Ubuntu", 1, 18));

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				buttonFlag.buttonAddFlag = 1;
				buttonFlag.buttonUpdateFlag = 1;
				buttonFlag.buttonQueryFlag = 1;
				buttonFlag.buttonDeleteFlag = 1;
			}
		});
	}
}