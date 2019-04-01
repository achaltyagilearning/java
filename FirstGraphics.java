import javax.swing.JOptionPane;

class FirstGraphics{
	
	public static void main(String args[])
	{
		String fn = JOptionPane.showInputDialog("Enter the first Number");
		String sn = JOptionPane.showInputDialog("Enter the Second Number");
		
		int ffn = Integer.parseInt(fn);
		int ssn = Integer.parseInt(sn);
		
		int sum = ffn + ssn;
		
		JOptionPane.showMessageDialog(null, "The answer is"+sum,"It is the title",JOptionPane.PLAIN_MESSAGE);
		
	}
	
	
	
	
}