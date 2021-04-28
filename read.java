import java.io.*;
import java.util.*;
class read {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("File name: ");
		String fileName = input.nextLine();
		try {
			File file = new File(fileName);
			Scanner f = new Scanner(file);
			do {
				System.out.println(f.nextLine());
			} while (f.hasNextLine());
			f.close();
		}catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
