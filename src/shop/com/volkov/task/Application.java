package shop.com.volkov.task;

import java.awt.ItemSelectable;
import java.util.Scanner;

public class Application {
	private final int RUN = 1;
	private final int CLOSE = 2;
	private int value_on = 1;
	private int menu_value;
	private int quantity_of_items;
	Scanner scan;

	public static void main(String[] argth) {
		Application app = new Application();
		app.runTheApp();
	}

	private void runTheApp() {
		Seller seller = new Seller();
		seller.makeMenu();
		while (value_on == RUN) {
			seller.menuPrinter();
			seller.menuSelection();
			makeScan(RUN);
			makeNumber(scan.nextInt());
			makeChoice(menu_value);
			seller.itemsNumbers();
			do {
				makeNumber(scan.nextInt());
				if (menu_value < 1 || menu_value > 4) {
					seller.itemsNumbers();
				}
			} while (menu_value < 1 || menu_value > 4);
			seller.quantityPrinter();
			makeQuantity(scan.nextInt());
			seller.createMassive(quantity_of_items);
			seller.selection(menu_value, quantity_of_items);
			seller.anotherChoicePrinter();
			makeNumber(scan.nextInt());
			if (menu_value != RUN) {
				value_on = CLOSE;
			}
		}
		seller.checker();
		makeScan(CLOSE);

	}

	private void makeChoice(int x) {
		if (x != 1) {
			makeScan(CLOSE);
			System.exit(0);
		}
	}

	private void makeScan(int value) {
		if (value == RUN) {
			this.scan = new Scanner(System.in);
		} else {
			this.scan.close();
		}
	}

	private int makeNumber(int x) {
		return this.menu_value = x;
	}

	private int makeQuantity(int x) {
		return this.quantity_of_items = x;
	}
}
