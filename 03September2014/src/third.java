import java.util.Scanner;


public class third {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		int stacks = 0;
		int beers = 0;
		while(bool) {
			String[] str = input.nextLine().split(" ");
			if(str[0].equals("End")){
				break;
			}
			else {
				if(str[1].equals("beers")){
					beers += Integer.parseInt(str[0]);
				}
				else {
					beers += Integer.parseInt(str[0])*20;
				}
			}
		}
		
		stacks = beers/20;
		beers = beers%20;
		System.out.printf("%d stacks + %d beers", stacks, beers);
		
	}

}
