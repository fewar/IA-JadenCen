import java.io.*;
import java.util.*;
class write {
	static String fileName;
	public static void main(String args[]) {
		try {
			write obj = new write();
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
	void writeFile(String fileName) { // this method is to write
		try {//to the file
			this.fileName = fileName;
			File file = new File(fileName);
			FileWriter man = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			int wowo = 0;
			do {
				String inputData = input.nextLine();
				if (inputData == "quit") {
					wowo = 1;
				}
				inputData = inputData + "\n";
				man.write(inputData);
			} while (wowo != 1);
			man.close();
			System.out.println("file created");
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
                }
        }
}

