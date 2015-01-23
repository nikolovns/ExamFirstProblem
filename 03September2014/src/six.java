import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class six {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		
		Scanner inputTime = new Scanner(System.in);
		String fTime = inputTime.nextLine();
		String sTime = inputTime.nextLine();
		
		String patern = "HH:mm:ss";
		SimpleDateFormat df = new SimpleDateFormat(patern);
		Date day1 = df.parse(fTime);
		Date day2 = df.parse(sTime);
		long diff = day1.getTime() - day2.getTime();
		long hours = diff / (60 * 60 * 1000) % 24;
		long minutes = diff / (60 * 1000) % 60;
		long seconds = diff / 1000 % 60;

		System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
	}

}
