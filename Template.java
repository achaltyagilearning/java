import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Template extends JFrame{
	
	private JLabel item1;
	
	public Template(){
		super("This is the title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence inside the dialog");
		item1.setToolTipText("This is gonna show up when i hover on the below text");
		add(item1);
	}
	
	
}