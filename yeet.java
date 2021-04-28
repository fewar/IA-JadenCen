import java.util.*;

public class yeet {
	public static void main(String args[]) {
		String option;
		System.out.println("Hi, Mr.Johnson, would you like to...\n" +
			 "View recipes" + "Search" + "");
		Scanner optionInput = new Scanner(System.in);
		option = optionInput.nextLine();
		if (option == "quit") {
			System.exit(0);
		}
		else if (option == "view recipes") {
			System.out.println("arratlist<recipes> recipes");
		}
