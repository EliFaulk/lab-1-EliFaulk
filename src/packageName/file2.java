package packageName;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		System.out.print("Enter a number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter a number: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Enter an operation (A,S,M,D): ");
		String buffer = scanner.nextLine();
		String operation = scanner.nextLine();
		
		scanner.close();
		
		if (operation.equals("A")) {
			result = num1 + num2;
		} else if (operation.equals("S")) {
			result = num1 - num2;
		} else if (operation.equals("M")) {
			result = num1 * num2;
		} else if (operation.equals("D")) {
			result = num1 / num2;
		}
		
		System.out.println(result);

	}

}
