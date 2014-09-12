package loopsMethodsClasses;

import java.util.Scanner;
import java.util.TreeMap;

public class _12_examScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Skip the first 3 lines
		sc.nextLine();
		sc.nextLine();
		sc.nextLine();
		TreeMap<Integer, TreeMap<String, Double>> points = new TreeMap<>();
		while (true) {
			String[] input = sc.nextLine().split("\\s*\\|\\s*");
			if (input.length < 4) {
				
				break;
			}
			String student = input[1];
			int score = Integer.parseInt(input[2]);
			double grade = Double.parseDouble(input[3]);
			if (!points.containsKey(score)) {
				points.put(score, new TreeMap<>());
			}
			points.get(score).put(student, grade);			
		}
		
		
		for (Integer score : points.keySet()) { 
			System.out.print(score + " -> "); 
			System.out.println(points.get(score).keySet());
			double sum=0;
			for (double grade : points.get(score).values()) {
				sum+=grade;
			}
			double avg=sum/points.get(score).values().size();
			System.out.printf("; avg=%.2f\n",avg);

		}

	}
}