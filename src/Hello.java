import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("How are you?");
		String response = scanner.nextLine();
		if(response == "Good") {
			System.out.println("Great!");
		}
		else if(response == "Bad") {
			System.out.println("Hope it gets better!");
		}
		else {
			System.out.println("Sorry, the only options were Good or Bad");
		}
	}
}
