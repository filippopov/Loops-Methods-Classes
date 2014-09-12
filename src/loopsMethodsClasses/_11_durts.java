package loopsMethodsClasses;

import java.util.Scanner;

public class _11_durts {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int centerX = input.nextInt();
		int centerY = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();
		
		double verticalRectMinX = centerX - (0.5 * r);
		double verticalRectMaxX = centerX + (0.5 * r);
		double verticalRectMinY = centerY - r;
		double verticalRectMaxY = centerY + r;
		
		double horizontalRectMinX = centerX - r;
		double horizontalRectMaxX = centerX + r;
		double horizontalRectMinY = centerY - (0.5*r);
		double horizontalRectMaxY = centerY + (0.5*r);
		for (int i = 0; i < n; i++) {
			double x=input.nextDouble();
			double y = input.nextDouble();
			if ((x>=verticalRectMinX&&x<=verticalRectMaxX&&y>=verticalRectMinY&&y<=verticalRectMaxY)||
					(x>=horizontalRectMinX&&x<=horizontalRectMaxX&&y>=horizontalRectMinY&&y<=horizontalRectMaxY)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
		


	}

}
