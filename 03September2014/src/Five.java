import java.util.Scanner;


public class Five {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split("\\P{Alpha}+");
		Boolean bool = true;
		for (int i1 = 0; i1 < str.length; i1++) {
			for (int i2 = 0; i2 < str.length; i2++) {
				for (int i3 = 0; i3 < str.length; i3++) {
					if(i1!=i2){
						if((str[i1]+str[i2]).equals(str[i3])) {
							System.out.printf("%s|%s=%s%n", str[i1], str[i2], str[i3]);
							bool = false;
						}
					}
				}
			}
		}
		if(bool) {
			System.out.println("No");
		}
	}

}
