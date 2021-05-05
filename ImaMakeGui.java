// use jframe for the text edit
//this would be add thing interface
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ImaMakeGui {
	public static void main(String args[]) {
		kee();
	}
	public static void kee() {
		JFrame frame = new JFrame("A title");
		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
/*test*/	JButton b3 = new JButton("Exit");
		b3.setSize(100, 100);
/*test*/	b3.setLocation(100, 100);
		JTextArea textarea = new JTextArea("String here");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("This is a JLabel");
		JLabel label1 = new JLabel("40, 50");
		b1.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                                System.out.println("b1, button 1, pressed");
                                        }
                                });
                b2.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                                System.out.println("b2, button 2, pressed");
                                        }
                                });
		b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
		b1.setSize(150,35);
		b1.setLocation(200, 600);
		b2.setSize(150, 35);
		b2.setLocation(400, 600);
		textarea.setSize(50, 50);
		textarea.setLocation(300, 400);
		label.setSize(150,70);
		label.setLocation(300, 0);
		label1.setLocation(40 ,50);
		label1.setSize(70,70);
		panel.setLayout(null);
		panel.add(label1);
		panel.add(textarea);
		panel.add(b1);
		panel.add(b2);
/*test*/	panel.add(b3);
		panel.add(label);
		frame.add(panel);
		frame.setSize(600, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
