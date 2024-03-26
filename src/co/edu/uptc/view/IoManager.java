package co.edu.uptc.view;

import javax.swing.JOptionPane;

public class IoManager {

	public IoManager() {

	}

	public int readInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}

	public void printMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}
