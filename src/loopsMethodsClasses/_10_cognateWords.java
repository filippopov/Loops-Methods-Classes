package loopsMethodsClasses;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class _10_cognateWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split("[^a-zA-Z]+");
		HashSet <String>result=new HashSet<>();
		int count=0;
		for (int a = 0; a < line.length; a++) {
			for (int b = 0; b < line.length; b++) {
				
				for (int c = 0; c < line.length; c++) {
					if (line[a]!=line[b]) {
						if (line[c].equals(line[a]+line[b])) {
							result.add(line[a]+"|"+line[b]+"="+line[c]);
							count++;
						}
					}
				}
			}
		}
		for (String string : result) {
			System.out.println(string);
		}
		if (count==0) {
			System.out.println("No");
		}

	}

}

