import java.io.*;
import java.util.*;
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
		try {
			this.fileName = fileName;
			File file = new File(fileName);
			FileWriter man = new FileWriter(fileName);
			Scanner input = new Scanner(System.in);
			String inputData = input.nextLine();
			man.write(inputData);
			man.close();
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
