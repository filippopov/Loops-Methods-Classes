package loopsMethodsClasses;

import java.util.Scanner;

public class _1_symetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		if ((numberOne>=0)&&(numberTwo<=999)) {
			for (int i = numberOne; i <= numberTwo; i++) {
				if ((i>=0)&&(i<=9)) {
					System.out.println(i);
				}
				else if ((i>=10)&&(i<=99)) {
					int second = i%10;
					int first = i/10;
					if (second==first) {
						System.out.println(i);
					}
				}
				else if ((i>=100)&&(i<=999)) {
					
					int therd=i%10;
					int first = i/100;
					if (therd==first) {
						System.out.println(i);
						
					}
					
				}
			}
			
		}
		else {
			System.out.println("Invalid Number");
		}

	}

}
