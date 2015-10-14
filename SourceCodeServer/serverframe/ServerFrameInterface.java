package serverframe;

import javax.swing.JButton;
import javax.swing.JLabel;

public interface ServerFrameInterface {
	public JButton buttonExit = new JButton("Exit");
	public JButton buttonQuery = new JButton("Data Query");
	public JButton buttonAdd = new JButton("Add Table");
	public JButton buttonDelete = new JButton("Delete Table");
	public JButton buttonUpdate = new JButton("Update Table");
	public JLabel appNameLabel = new JLabel();
}