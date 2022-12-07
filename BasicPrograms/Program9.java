import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = i + 2; j < array.length; j += 2) {
					if (array[i] < array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			} else {
				for (int j = i + 2; j < array.length; j += 2) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		for (int i : array)
			System.out.print(i + " ");
	}
}