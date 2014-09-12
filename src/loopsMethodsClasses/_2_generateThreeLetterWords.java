package loopsMethodsClasses;

import java.util.Scanner;

public class _2_generateThreeLetterWords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char []leters = input.next().toCharArray();
		if (leters.length==3) {
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					for (int c = 0; c < 3; c++) {
						System.out.printf("%s%s%s ",leters[a],leters[b],leters[c]);
					}
				}
			}
		}
		if (leters.length==2) {
			for (int a = 0; a < 2; a++) {
				for (int b = 0; b < 2; b++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("%s%s%s ",leters[a],leters[b],leters[c]);
					}
				}
			}
		}
		else {
			System.out.printf("%s%s%s ",leters[0],leters[0],leters[0]);
		}

	}

}
