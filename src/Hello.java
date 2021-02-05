import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("How are you?");
		String response = scanner.nextLine();

		boolean answered = false;

		while (answered == false) {
			if (response.equals("Good")) {
				System.out.println("Great!");
				answered = true;
			} else if (response.equals("Bad")) {
				System.out.println("Hope it gets better!");
				answered = true;
			}

		}

	}

}
