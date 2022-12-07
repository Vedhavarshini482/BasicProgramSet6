import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an input String and reference String");
		String inputString = scanner.nextLine();
		String refString = scanner.nextLine();
		inputString = inputString.toLowerCase();
		refString = refString.toLowerCase();
		int count[] = new int[refString.length()];
		for (int i = 0; i < refString.length(); i++) {
			int number = 0;
			for (int j = 0; j < inputString.length(); j++) {
				if (inputString.charAt(j) == refString.charAt(i))
					number++;
			}
			count[i] = number;
		}
		for (int i = 0; i < refString.length(); i++) {
			System.out.println(refString.charAt(i) + " : " + count[i]);
		}
	}
}