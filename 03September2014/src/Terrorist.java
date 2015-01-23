import java.util.Scanner;


public class Terrorist {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char[] str = input.nextLine().toCharArray();
		long sum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i]=='|'){
				start = i;
				for (int j = i+1; j < str.length; j++) {
					if (str[j]=='|') {
						end = j;
						i=j-1;
						break;
					}
					sum += str[j];
				}
			}
			if(sum!=0) {
				long def = sum%10;
				for (int c = 0; c < str.length; c++) {
					if(c>=start-def && c<=end+def) {
						str[c]='.';
					}
				}
				sum=0;
				start=0;
				end = 0;
			}
		}
		for (char c : str) {
			System.out.print(c);
		}
	}

}
