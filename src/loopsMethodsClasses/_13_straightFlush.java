package loopsMethodsClasses;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_straightFlush {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String line= input.nextLine();
		ArrayList<String> number = new ArrayList<>(); 
		Pattern regex=Pattern.compile("[\\AKQJ]");
		Matcher match = regex.matcher(line);
		while (match.find()) {
			number.add((match.group()));
		}
		System.out.println(number);

	}

}
