package GUI;

import DTO.*;

import java.util.Scanner;

public class AntiqueShop
{
	static Scanner scanner = null;

	private static int getUserChoice(String[] choice) {
		for(int i = 0; i < choice.length; ++i) {
			System.out.format("%d. %s\n", i + 1, choice[i]);
		}
		System.out.print("Enter your choice: ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Item item = null;
		String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display item"};
		int choice = 0;
		do {
			choice = AntiqueShop.getUserChoice(options);
			if(choice == 1) {
				item = new Vase();
				((Vase)item).inputVase();
			} else if(choice == 2) {
				item = new Statue();
				((Statue)item).inputStatue();
			} else if(choice == 3) {
				item = new Painting();
				((Painting)item).inputPainting();
			} else if(choice == 4) {
				if(item != null) {
					if(item instanceof Vase) {
						((Vase)item).outputVase();
					} else if(item instanceof Statue) {
						((Statue)item).outputStatue();
					} else if(item instanceof Painting) {
						((Painting)item).outputPainting();
					} else {
						item.output();
					}
				} else {
					System.out.println("Item has not ininialized yet.");
				}
			}
		} while(choice <= 4);
	}
};