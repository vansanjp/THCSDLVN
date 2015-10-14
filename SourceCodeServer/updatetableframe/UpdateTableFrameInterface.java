package updatetableframe;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;	

public interface UpdateTableFrameInterface {
	public JButton buttonOk = new JButton("OK");
	public JLabel labelFrameName = new JLabel("UPDATE TABLE");
	public JLabel labelTableName = new JLabel("Table Name");
	public JLabel labelSetNewValue = new JLabel("Set New Value");
	public JLabel labelCondition = new JLabel("Condition");
	public JLabel labelHelp = new JLabel("HELP");
	public JTextField tableNameTextField = new JTextField();
	public JTextField setNewValueTextField = new JTextField();
	public JTextField conditionTextField = new JTextField();
}