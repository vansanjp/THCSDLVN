package insertdataframe;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;	

public interface InsertDataFrameInterface {
	public JButton buttonOk = new JButton("OK");
	public JLabel labelFrameName = new JLabel("INSERT DATA");
	public JLabel labelTableName = new JLabel("Table Name");
	public JLabel labelListValues = new JLabel("List Values");
	public JLabel labelDiagram = new JLabel("DIAGRAM");
	public JLabel labelHelp = new JLabel("HELP");
	public JTextField tableNameTextField = new JTextField();
	public JTextField listValuesTextField = new JTextField();
}