import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int rows = scanner.nextInt();
		for (int i = 1; i <= rows; i++) {
			int sum = i;
			for (int j = 1; j <= i; j++) {
				if (j == 1)
					System.out.print(i + " ");
				else {
					sum += rows;
					System.out.print(sum + " ");
				}
			}
			System.out.println();
		}
	}
}