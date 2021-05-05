import java.io.*;
import java.util.*;
import java.awt.*;

class writeRead {
	static String fileName;
	public static void main(String args[]) {
		try {
			writeRead obj = new writeRead();
			obj.nameOfFile();
			obj.writeFile(fileName);
		}catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
	public String nameOfFile() {
		Scanner nameInput = new Scanner(System.in);
		System.out.print("File name: ");
		fileName = nameInput.nextLine();
		return fileName;
	}
	void writeFile(String fileName) {
			this.fileName = fileName;
		try {
			File file = new File(fileName);
			Desktop.getDesktop().edit(file);
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
