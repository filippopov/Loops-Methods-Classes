package loopsMethodsClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _6_randomHandsOfFiveCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String []cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String [] suits ={"♣","♦","♥","♠"};
		int number = input.nextInt();
		Random rnd = new Random();
		ArrayList<String> allCards = new ArrayList<String>();
		for (String card : cards) {
			for (String suit : suits) {
				allCards.add(" "+card+suit);
			}
		}
		ArrayList<String> pullCards = new ArrayList();
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 5; j++) {
				int index = rnd.nextInt(allCards.size());
				String card = allCards.get(index);
				allCards.remove(index);
				pullCards.add(card);
				System.out.printf("%s",card);
			}
			System.out.println();
			allCards.addAll(pullCards);
		}

	}

}
