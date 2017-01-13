package shop.com.volkov.task;

import java.awt.ItemSelectable;
import java.util.Scanner;

import shop.com.volkov.task.items.Carpet;
import shop.com.volkov.task.items.Hoover;
import shop.com.volkov.task.items.Laptop;

public class Seller {
	private IPrintable[] items;
	private ICostable[] arr;
	private int elements;
	private final int HOOVER_VALUE = 1;
	private final int LAPTOP_VALUE = 2;
	private final int CARPET_VALUE = 3;

	public void makeMenu() {

		items = new Item[3];
		items[0] = new Hoover();
		items[1] = new Laptop();
		items[2] = new Carpet();
	}

	public void menuPrinter() {
		System.out.println("In stock are present in the following products:");
		for (int i = 0; i < items.length; i++) {
			int j = i + 1;
			System.out.println("number " + j);
			System.out.println(items[i].getInfo());
		}
	}

	public void menuSelection() {
		System.out.println("ener 1 to make an order; enter 2 to exit;");
	}

	public void quantityPrinter() {
		System.out.println("enter the quantity of the goods");
	}

	public void itemsNumbers() {
		System.out.println("1 - Hoover; 2 - Laptop;\n3 - Carpet; 4 - exit;");
	}

	public void anotherChoicePrinter() {
		System.out.println("1 - select other items; other buttons - complete the order and print a check");
	}

	public void selection(int menu_value, int quantity_of_items) {
		while (elements < arr.length) {
			switch (menu_value) {
			case HOOVER_VALUE:
				arr[elements++] = new Hoover();
				break;
			case LAPTOP_VALUE:
				arr[elements++] = new Laptop();
				break;
			case CARPET_VALUE:
				arr[elements++] = new Carpet();
				break;
			}

		}
	}

	public ICostable[] createMassive(int quantity_of_items) {
		if (arr == null) {
			this.arr = new Item[quantity_of_items];

		} else {
			ICostable[] arr1 = new Item[arr.length + quantity_of_items];
			for (int i = 0; i < arr.length; i++) {
				arr1[i] = arr[i];
			}
			this.arr = arr1;

		}
		return arr;
	}

	public void checker() {
		int sumCost=0;
		for (int i = 0; i < arr.length; i++) {
			sumCost+=this.arr[i].checkPrinter();
		}
		System.out.println("total amount is " + sumCost);

	}
}
