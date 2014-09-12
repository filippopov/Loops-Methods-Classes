package loopsMethodsClasses;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class _7_daysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String dateStart = input.nextLine();
		String dateEnd = input.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date start =null;
		java.util.Date end = null;
		String startDate= dateStart;
		String endDate = dateEnd;
		start = format.parse(startDate); 
 		end = format.parse(endDate); 
				 

		long diference = end.getTime()-start.getTime();
		long days = diference/(24*60*60*1000);
		System.out.println(days);

	}

}
