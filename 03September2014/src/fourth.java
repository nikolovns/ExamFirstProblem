import java.util.Scanner;


public class fourth {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		Boolean bool = true;
		String[] str = input.nextLine().split(" ");
		for (int i1 = 0; i1 < str.length; i1++) {
			for (int i2 = 0; i2 < str.length; i2++) {
				if(str[i1].equals(str[i2])){
					continue;
				}
				String str1 = str[i1]+str[i2];
				for (int i3 = 0; i3 < str.length; i3++) {
					if(str[i1].equals(str[i3]) || str[i2].equals(str[i3])){
						continue;
					}
					for (int i4 = 0; i4 < str.length; i4++) {
						if (!str[i1].equals(str[i4]) && !str[i2].equals(str[i4]) 
								&& !str[i3].equals(str[i4])) {
							String str2 = str[i3]+str[i4];
							if(str1.equals(str2)){
								System.out.printf("%s|%s==%s|%s%n",str[i1], str[i2], str[i3], str[i4] );
								bool = false;
							}
							
						}
					}
				}
			}
		}
		if(bool) {
			System.out.print("No");
		}
		
	}

}
