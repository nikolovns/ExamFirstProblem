import java.util.Scanner;


public class first {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int eggs = 0;
		for (int i = 0; i < 7; i++) {
			String[] str = input.nextLine().split(" ");
			if(str[1].equals("eggs")) {
				eggs+=Double.parseDouble(str[0]);
			}
			else {
				eggs+=Double.parseDouble(str[0])*12;
			}
		}
		int doz = eggs/12;
		eggs -= doz*12;
		
		System.out.printf("%d dozens + %d eggs", doz, eggs);
	}

}
