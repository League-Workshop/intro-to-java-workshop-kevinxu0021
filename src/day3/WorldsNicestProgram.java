package day3;

import javax.swing.JOptionPane;

public class WorldsNicestProgram {
	public static void main(String[] args) {
		String name;
		name = JOptionPane.showInputDialog("What is your name");
		if (name == null) {
			
		}else {
		JOptionPane.showMessageDialog(null, name + ", you look lovely today.");
		}
	}

}
