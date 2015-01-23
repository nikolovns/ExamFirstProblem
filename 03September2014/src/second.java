import java.util.Scanner;


public class second {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		boolean bool = true;
		while(bool) {
			String[] str = input.nextLine().split(":");
			if(!str[0].equals("End")) {
				int min = Integer.parseInt(str[1]);
				int hou = Integer.parseInt(str[0]);
				hours+=hou;
				minutes+=min;
			}
			else {
				bool = false;
			}
		}
		int houMin = minutes/60;
		minutes = minutes-houMin*60;
		hours+=houMin;
		System.out.printf("%d:%02d", hours, minutes);
	}

}
