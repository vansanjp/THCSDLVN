package deletetableframe;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;	

public interface DeleteTableFrameInterface {
	public JButton buttonOk = new JButton("OK");
	public JLabel labelFrameName = new JLabel("DELETE TABLE");
	public JLabel labelTableName = new JLabel("Table Name");
	public JLabel labelCondition = new JLabel("Condition");
	public JLabel labelHelp = new JLabel("HELP");
	public JTextField tableNameTextField = new JTextField();
	public JTextField conditionTextField = new JTextField();
}