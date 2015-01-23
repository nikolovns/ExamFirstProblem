import java.util.Scanner;


public class MirrorNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		String[] numbers = input.nextLine().split(" ");

		for (int first = 0; first < numbers.length; first++) {
			for (int sec = first+1; sec < numbers.length; sec++) {
				String reverse = numbers[sec];
				reverse = new StringBuilder(reverse).reverse().toString();

				if(numbers[first].equals(reverse)) {
					System.out.printf("%S<!>%s%n", numbers[first], numbers[sec]);
				}
			}
		}

	}

}
