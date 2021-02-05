import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("How are you?");
		String response = scanner.nextLine();
		System.out.println("Great!");
	}
}
