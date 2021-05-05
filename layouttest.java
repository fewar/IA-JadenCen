//this would be edit interface
import java.awt.*;
import javax.swing.*;
class layouttest {
	public static void main(String args[]) {
		JFrame frame = new JFrame("frame");
		JLabel label = new JLabel("450, 450");
		JLabel label1 = new JLabel("0, 0");
		JLabel label2 = new JLabel("450,0");
		JLabel label3 = new JLabel("0,450");
		JPanel panel = new JPanel(); //component needed
		panel.setLayout(null); //enable component setting
		label.setSize(70, 70); //from here
		label1.setSize(70, 70);
		label2.setSize(70, 70);
		label3.setSize(70, 70);
		label.setLocation(400, 400);
		label1.setLocation(0, 0);
		label2.setLocation(400, 0);
		label3.setLocation(0, 400); // to here, setting label
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel); //add things
		frame.setSize(470, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
