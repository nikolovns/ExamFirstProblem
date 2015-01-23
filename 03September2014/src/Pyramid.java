import java.util.Scanner;
import java.util.Spliterator;


public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.nextLine());
		String str2 = input.nextLine().trim();
		String[] str = str2.split("\\s+");
		int a = Integer.parseInt(str[0]);
		int max = Integer.MAX_VALUE;
		String output = "" + a;
		for (int i = 1; i < number; i++) {
			String row = input.nextLine().trim();
			String[] trimRow = row.split("\\s+");
			int length = trimRow.length;
			for(int j=0; j<length; j++) {
				int b = Integer.parseInt(trimRow[j]);
				if(b>a && b<max) {
					max = b;
				}
			}
			if(max!=2147483647 && max>a) {
				output += ", " + max;
				a=max;
			}
			else {
				a++;
			}
			max = Integer.MAX_VALUE;
		}
		System.out.println(output.trim());
	}

}
