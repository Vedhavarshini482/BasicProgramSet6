import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array elements");
		int array[] = new int[size];// 3,3,4,5,6,4
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != 0)// 3,0,4,5,6,0
					array[j] = 0;
			}
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[j] == 0) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i] != 0)
				count++;
		}
		System.out.println("\nNon Zero Index = " + (count - 1));
	}
}