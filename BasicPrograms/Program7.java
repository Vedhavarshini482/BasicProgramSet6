import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		String jumbledNumber = Integer.toString(number);
		for (int i = 0; i < jumbledNumber.length() - 1; i++) {
			if (Math.abs((int) (jumbledNumber.charAt(i) - '0')
					- (int) (jumbledNumber.charAt(i + 1) - '0')) != 1) {
				System.out.println(number + " is not a Jumbled Number");
				return;
			}
		}
		System.out.println(number + " is a jumbled number");
	}
}