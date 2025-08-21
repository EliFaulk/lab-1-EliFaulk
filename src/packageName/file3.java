package packageName;
import java.util.Scanner;

public class file3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String username = "admin";
		String password = "1234password";
		
		System.out.print("Enter a username: ");
		String user = scanner.nextLine();
		
		System.out.print("Enter a password: ");
		String pass = scanner.nextLine();
		
		scanner.close();
		
		if (user.equals(username) && pass.equals(password)) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Login failed. Please try again.");
		}

	}

}
