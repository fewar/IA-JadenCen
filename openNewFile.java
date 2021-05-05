// might not be useful
import java.io.*;
import java.awt.*;
class openNewFile {
	public static void main(String args[]) {
		try {
			File file = new File("hi.txt");
			Desktop desktop = Desktop.getDesktop(); //???
			desktop.open(file);
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
