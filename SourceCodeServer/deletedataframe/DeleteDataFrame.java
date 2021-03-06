package deletedataframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import buttonflag.ButtonFlag;

public class DeleteDataFrame extends JFrame implements DeleteDataFrameInterface{
	public DeleteDataFrame(ButtonFlag buttonFlag){
		super("Delete Data");
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(360,360));
		pack();

		getContentPane().add(labelFrameName);
		getContentPane().add(labelTableName);
		getContentPane().add(labelCondition);
		getContentPane().add(labelHelp);
		getContentPane().add(tableNameTextField);
		getContentPane().add(conditionTextField);
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

		labelCondition.setFont(new Font("Ubuntu", 1, 16));
		labelCondition.setForeground(new Color(22, 117, 245));
		labelCondition.setHorizontalAlignment(SwingConstants.CENTER);
		labelCondition.setBorder(BorderFactory.createEtchedBorder());
		labelCondition.setBounds(30, 160, 110, 40);

		conditionTextField.setFont(new java.awt.Font("Ubuntu", 0, 18));
		conditionTextField.setBounds(170, 160, 160, 40);
		tableNameTextField.setBounds(170, 90, 160, 40);
		tableNameTextField.setFont(new Font("Ubuntu" , 1, 18));

		labelHelp.setFont(new Font("Ubuntu", 1, 16));
		labelHelp.setForeground(new Color(22, 117, 245));
		labelHelp.setHorizontalAlignment(SwingConstants.CENTER);
		labelHelp.setBounds(20, 320, 40, 20);
		labelHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		labelHelp.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
				StringBuffer msg = new StringBuffer(); 
				msg.append("This is the window to delete data,");
				msg.append("\nyou enter table name into the textfield next to the Table Name 's label.");
				msg.append("\nYou enter condition into the textfield next to the Condition's label.");
				msg.append("\nEach time you can only delete data of one table");
				msg.append("\nClick OK to finish.");
				JOptionPane.showMessageDialog(null,msg.toString(),"Help Of DeleteFrame",JOptionPane.INFORMATION_MESSAGE,icon);
			}
		});

		buttonOk.setFont(new Font("Ubuntu", 1, 18));
		buttonOk.setForeground(new Color(22, 117, 245));
		buttonOk.setBounds(120, 257, 130, 40);
		buttonOk.setBackground(Color.WHITE);

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