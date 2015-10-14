package dataqueryframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import buttonflag.ButtonFlag;

public class DataQueryFrame extends JFrame implements DataQueryFrameInterface{
	public DataQueryFrame(ButtonFlag buttonFlag){
		super("Data Query");
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(485,510));
		pack();

		getContentPane().add(labelFrameName);
		getContentPane().add(labelTableName);
		getContentPane().add(labelColumnName);
		getContentPane().add(labelCondition);
		getContentPane().add(labelHelp);
		getContentPane().add(labelGroupBy);
		getContentPane().add(labelHaving);
		getContentPane().add(labelOrderBy);
		getContentPane().add(tableNameTextField);
		getContentPane().add(conditionTextField);
		getContentPane().add(listColumnTextField);
		getContentPane().add(groupByTextField);
		getContentPane().add(havingTextField);
		getContentPane().add(orderByTextField);
		getContentPane().add(asc);
		getContentPane().add(desc);
		getContentPane().add(buttonOk);

		labelFrameName.setFont(new Font("Ubuntu", 1, 24));
		labelFrameName.setForeground(new Color(246, 9, 9));
		labelFrameName.setHorizontalAlignment(SwingConstants.CENTER);
		labelFrameName.setBounds(140, 10, 200, 28);

		labelTableName.setFont(new Font("Ubuntu", 1, 16));
		labelTableName.setForeground(new Color(22, 117, 245));
		labelTableName.setHorizontalAlignment(SwingConstants.CENTER);
		labelTableName.setBorder(BorderFactory.createEtchedBorder());
		labelTableName.setBounds(60, 60, 110, 40);

		labelColumnName.setFont(new Font("Ubuntu", 1, 16));
		labelColumnName.setForeground(new Color(22, 117, 245));
		labelColumnName.setHorizontalAlignment(SwingConstants.CENTER);
		labelColumnName.setBorder(BorderFactory.createEtchedBorder());
		labelColumnName.setBounds(60, 120, 110, 40);

		labelCondition.setFont(new Font("Ubuntu", 1, 16));
		labelCondition.setForeground(new java.awt.Color(22, 117, 245));
		labelCondition.setHorizontalAlignment(SwingConstants.CENTER);
		labelCondition.setBorder(BorderFactory.createEtchedBorder());
		labelCondition.setBounds(60, 180, 110, 40);

		labelGroupBy.setFont(new Font("Ubuntu", 1, 16));
		labelGroupBy.setForeground(new Color(22, 117, 245));
		labelGroupBy.setHorizontalAlignment(SwingConstants.CENTER);
		labelGroupBy.setBorder(BorderFactory.createEtchedBorder());
		labelGroupBy.setBounds(60, 240, 110, 40);

		labelHaving.setFont(new Font("Ubuntu", 1, 16));
		labelHaving.setForeground(new Color(22, 117, 245));
		labelHaving.setHorizontalAlignment(SwingConstants.CENTER);
		labelHaving.setBorder(BorderFactory.createEtchedBorder());
		labelHaving.setBounds(60, 300, 110, 40);

		labelOrderBy.setFont(new Font("Ubuntu", 1, 16));
		labelOrderBy.setForeground(new Color(22, 117, 245));
		labelOrderBy.setHorizontalAlignment(SwingConstants.CENTER);
		labelOrderBy.setBorder(BorderFactory.createEtchedBorder());
		labelOrderBy.setBounds(60, 360, 110, 40);

		labelHelp.setFont(new Font("Ubuntu", 1, 16));
		labelHelp.setForeground(new Color(22, 117, 245));
		labelHelp.setHorizontalAlignment(SwingConstants.CENTER);
		labelHelp.setBounds(20, 480, 49, 17);
		labelHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		labelHelp.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				Icon icon = new ImageIcon("/home/mylaptop/AppDatabase/DatabaseOfResApp/Resource/float.png");
				String msg = "This is the window to retrieve data,"+
							"\nyou enter table name into the textfield next to the Table Name 's label."+
							"\nIn the textfield next to the List Column 's label,"+
							"\nyou'll enter a list of data columns in the table that you want to retrieve"+
							"\nIn the textfield next to the Condition 's label,"+
							"\nyou'll enter conditions that you want to retrieve"+
							"\nIn the textfield next to the Group By 's label,"+
							"\nyou'll enter columns that you want to group"+
							"\nIn the textfield next to the Having 's label,"+
							"\nyou'll enter conditions that you want to group"+
							"\nIn the textfield next to the Order By 's label,"+
							"\nyou'll enter columns in the table that you want to order by"+
							"\nthe names of the columns will be separated by ','."+
							"\nClick OK to complete the retrieval.";
				JOptionPane.showMessageDialog(null,msg,"Help Of DataQueryFrame",JOptionPane.INFORMATION_MESSAGE,icon);
			}
		});

		buttonOk.setFont(new Font("Ubuntu", 1, 18));
		buttonOk.setForeground(new Color(22, 117, 245));
		buttonOk.setBounds(190, 450, 100, 50);
		buttonOk.setBackground(Color.WHITE);
		
		tableNameTextField.setBounds(240, 60, 200, 40);
		tableNameTextField.setFont(new Font("Ubuntu" , 1, 18));
		listColumnTextField.setFont(new Font("Ubuntu" , 1, 18));
		listColumnTextField.setBounds(240, 120, 200, 40);
		conditionTextField.setBounds(240, 180, 200, 40);
		conditionTextField.setFont(new Font("Ubuntu" , 1, 18));
		groupByTextField.setFont(new Font("Ubuntu" , 1, 18));
		groupByTextField.setBounds(240, 240, 200, 40);
		havingTextField.setFont(new Font("Ubuntu" , 1, 18));
		havingTextField.setBounds(240, 300, 200, 40);
		orderByTextField.setFont(new Font("Ubuntu" , 1, 18));
		orderByTextField.setBounds(240, 360, 200, 40);

		asc.setBounds(240, 400, 60, 21);
		asc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.out.println(ae.getActionCommand());
			}
		});
		desc.setBounds(380, 400, 61, 21);
		buttonGroup.add(asc);
		buttonGroup.add(desc);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				buttonFlag.buttonAddFlag = 1;
				buttonFlag.buttonUpdateFlag = 1;
				buttonFlag.buttonDeleteFlag = 1;
			}
		});
	}
}