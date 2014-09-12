package loopsMethodsClasses;

import java.util.Scanner;

public class _5_angleUnitConverter {

	public static void main(String[] args) {
		  Scanner reader = new Scanner(System.in); 
	 	  System.out.println("Enter number 'n' to determine the number of entries: "); 
		  int n = Integer.parseInt(reader.nextLine()); 
		  double[] numbers = new double[n]; 
	 	  String[] measure = new String[n]; 
	 	
	 	  for (int i = 0; i < n; i++) { 
			  if (reader.hasNextDouble()) { 
	 			  numbers[i] = reader.nextDouble(); 
	 		} 
		  if (reader.hasNext()) { 
				  measure[i] = reader.next(); 
			} 
		  } 
		 
		  for (int i = 0; i < n; i++) { 
		    if (measure[i].equals("rad")) { 
				radiansToDegrees(numbers[i]); 
			} 
		    else if(measure[i].equals("deg")) { 
	 			degreesToRadians(numbers[i]); 
	 		} 
		  }	 
	 	} 
	 	 
	 	
	 	public static void degreesToRadians(double degrees){ 
	 		double radians = (degrees * (double)Math.PI) / 180.0d; 
	 		System.out.printf("%.6f rad\n",radians);		 
	 	} 
	
	 	public static void radiansToDegrees(double radians){ 
			double degrees = radians * (180.0d /(double)Math.PI); 
			System.out.printf("%.6f deg\n ",degrees);		 
		} 

}


